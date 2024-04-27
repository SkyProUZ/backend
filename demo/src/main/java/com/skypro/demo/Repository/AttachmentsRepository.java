package com.skypro.demo.Repository;

import com.skypro.demo.Entity.Attachments;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Profile("default")
public interface AttachmentsRepository extends JpaRepository<Attachments, Long> {
}
