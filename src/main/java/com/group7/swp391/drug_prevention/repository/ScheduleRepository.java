package com.group7.swp391.drug_prevention.repository;

import com.group7.swp391.drug_prevention.domain.Schedule;
import com.group7.swp391.drug_prevention.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> getConsultantByDay(LocalDate day);
    List<Schedule> getSchedulesByConsultantId(Long consultantId);

}
