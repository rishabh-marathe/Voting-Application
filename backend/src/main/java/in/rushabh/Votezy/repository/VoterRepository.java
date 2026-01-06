package in.rushabh.Votezy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rushabh.Votezy.entity.Voter;


public interface VoterRepository extends JpaRepository<Voter,Long> {
     boolean existsByEmail(String email);
}
