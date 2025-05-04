package in.rushabh.Votezy.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rushabh.Votezy.dto.VoteRequestDTO;
import in.rushabh.Votezy.dto.VoteResponseDTO;
import in.rushabh.Votezy.entity.Vote;
import in.rushabh.Votezy.service.VotingService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/votes")
@CrossOrigin
public class VotingController {
    private VotingService votingService;

	@Autowired
    public VotingController(VotingService votingService) {
		
		this.votingService = votingService;
	}
	@PostMapping("/cast")
    public ResponseEntity<VoteResponseDTO> castVote(@RequestBody @Valid VoteRequestDTO voteRequest){
    	Vote vote=votingService.castVote(voteRequest.getVoterId(),voteRequest.getCandidateId());
    	VoteResponseDTO voteResponse=new VoteResponseDTO("Vote casted successfully",true,vote.getVoterId(),vote.getCandidateId());
    	return new ResponseEntity<>(voteResponse,HttpStatus.CREATED);
    }
	@GetMapping
	public ResponseEntity<List<Vote>> getAllVotes(){
		List<Vote>voteList=votingService.getAllVotes();
		return new ResponseEntity<>(voteList,HttpStatus.OK);
	}
}   
