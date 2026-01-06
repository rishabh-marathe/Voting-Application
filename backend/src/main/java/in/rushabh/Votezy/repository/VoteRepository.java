package in.rushabh.Votezy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rushabh.Votezy.entity.Vote;


public interface VoteRepository extends JpaRepository<Vote,Long>{

}
