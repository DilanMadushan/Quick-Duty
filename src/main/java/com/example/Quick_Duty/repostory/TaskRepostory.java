package com.example.Quick_Duty.repostory;

import com.example.Quick_Duty.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepostory extends JpaRepository<Task, Long> {

}
