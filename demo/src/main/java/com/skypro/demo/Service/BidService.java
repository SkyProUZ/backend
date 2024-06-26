package com.skypro.demo.Service;

import com.skypro.demo.Entity.Bid;
import com.skypro.demo.Repository.BidRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BidService{

    @Autowired
    private BidRepository bidRepository;
    private static final Logger logger = LoggerFactory.getLogger(BidService.class);

    public Bid findById(long id) {
        Optional<Bid> exist = bidRepository.findById(id);
        if(exist.isPresent()){
            return exist.get();
        }else{
            return null;
        }
    }

    public Iterable<Bid> getAllBids(){
        return bidRepository.findAll();
    }

    public Bid save(Bid bid) {
        Bid b = bidRepository.save(bid);
        return b;
    }


    public List<Bid> findByProjectId(long id){
        return bidRepository.findByProjectId(id);
    }

}

