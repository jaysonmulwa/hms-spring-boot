package com.hms.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<History> getAllHistory() {
        List<History> history = new ArrayList<>();
        historyRepository.findAll().forEach(history::add);
        return history;
    }

    public Optional<History> getHistory(int id){
        Optional<History> byId = historyRepository.findById(id);
        return byId;
    }

    public void addHistory(History history) {
        historyRepository.save(history);
    }

    public void updateHistory(int id, History history) {
        historyRepository.save(history);
    }

    public void deleteHistory(int id) {
        historyRepository.deleteById(id);
    }

}
