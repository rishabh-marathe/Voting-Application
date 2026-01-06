package in.rushabh.Votezy.repository;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;

import in.rushabh.Votezy.entity.ElectionResult;


public interface ElectionResultRepository extends JpaRepository<ElectionResult,Long> {
    Optional<ElectionResult> findByElectionName(String electionName);
}
