package id.co.mii.overtimeclientapp.services;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import id.co.mii.overtimeclientapp.models.Employee;
import id.co.mii.overtimeclientapp.models.dto.requests.UserRequest;


@Service
public class EmployeeService {

    private RestTemplate restTemplate;

    @Autowired
    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${server.baseUrl}/employee")
    private String url;
    
    public List<Employee> getAll() {
        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {
                }).getBody();
    }
    
    public Employee getById(int id) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Employee>() {
                }).getBody();
    }

    public Employee create(UserRequest userRequest) {
        return restTemplate.exchange(
                url,
                HttpMethod.POST,
                new HttpEntity(userRequest),
                new ParameterizedTypeReference<Employee>() {
                }).getBody();
    }


    public Employee update(int id, Employee employee) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.PUT,
                new HttpEntity(employee),
                new ParameterizedTypeReference<Employee>() {
                }).getBody();
    }

    public Employee delete(int id) {
        return restTemplate.exchange(
                url + "/" + id,
                HttpMethod.DELETE,
                null,
                new ParameterizedTypeReference<Employee>() {
                }).getBody();
    }
    
}
