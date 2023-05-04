package id.co.mii.overtimeclientapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import id.co.mii.overtimeclientapp.models.HistoryOvertime;
import id.co.mii.overtimeclientapp.models.dto.requests.HistoryOvertimeRequest;

@Service
public class HistoryOvertimeService {

    private RestTemplate restTemplate;

    @Autowired
    public HistoryOvertimeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${server.baseUrl}/historyovertime")
    private String url;

    public List<HistoryOvertime> getAll() {
        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<HistoryOvertime>>() {
                }).getBody();
    }

    public HistoryOvertime getById(int id) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<HistoryOvertime>() {
                }).getBody();
    }

    public HistoryOvertime create(HistoryOvertimeRequest historyOvertimeRequest) {
        return restTemplate.exchange(
                url,
                HttpMethod.POST,
                new HttpEntity(historyOvertimeRequest),
                new ParameterizedTypeReference<HistoryOvertime>() {
                }).getBody();
    }

    public HistoryOvertime update(int id, HistoryOvertime historyOvertime) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.PUT,
                new HttpEntity(historyOvertime),
                new ParameterizedTypeReference<HistoryOvertime>() {
                }).getBody();
    }

    public HistoryOvertime delete(int id) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<HistoryOvertime>() {
                }).getBody();
    }
    
}
