package com.example.demo.serivce;

import com.example.demo.entity.ReportEntity;
import com.example.demo.repository.ReportRepository;
import com.example.demo.utils.GenerateRandomString;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService{
    @Autowired
    private final ReportRepository repository;

    public ReportServiceImpl(ReportRepository repository) {
        this.repository = repository;
    }

    @Override
    public void generateDataBase() {
        ReportEntity reportEntity = new ReportEntity();
        for (int i = 0; i < 20; i++) {
            reportEntity.setNum((int) Math.random());
            reportEntity.setStr(GenerateRandomString.generateRandomHexString(8));
        }
        repository.save(reportEntity);
    }
}
