package com.hostel.college;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<StudModel,Integer> {
    
}