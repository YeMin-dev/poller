package com.privasia.poller.core.repositories;

import com.privasia.poller.core.entity.MessageTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageTransactionRepository extends JpaRepository<MessageTransaction, String> {
}
