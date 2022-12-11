package com.hms.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/history")
    public List<History> getAllHistory() {
        return historyService.getAllHistory();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/history/{id}")
    public Optional<History> getHistory(@PathVariable int id) {
        return historyService.getHistory(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, value="/history")
    public void addHistory(@RequestBody History history) {
        historyService.addHistory(history);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.PUT, value="/history/{id}")
    public void updateHistory(@PathVariable int id, @RequestBody History history) {
        historyService.updateHistory(id, history);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.DELETE, value="/history/{id}")
    public void deleteHistory(@PathVariable int id) {
        historyService.deleteHistory(id);
    }
}
