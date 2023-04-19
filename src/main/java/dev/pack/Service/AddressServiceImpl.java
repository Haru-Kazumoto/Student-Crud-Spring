package dev.pack.Service;

import dev.pack.Entity.Address;
import dev.pack.Repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{

    private final AddressRepository repository;

    @Override
    public List<Address> findAllRecordAddress() {
        return repository.findAll();
    }
}
