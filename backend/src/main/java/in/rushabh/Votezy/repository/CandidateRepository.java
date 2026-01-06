package in.rushabh.Votezy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import in.rushabh.Votezy.entity.Candidate;


public interface CandidateRepository extends JpaRepository<Candidate,Long>{
    List<Candidate> findAllByOrderByVoteCountDesc();

}