package com.marian.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marian.address.modal.AddressModal;

@Repository
public interface AddressRepository extends JpaRepository<AddressModal, Integer> {
}