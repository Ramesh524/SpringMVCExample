package com.ramesh;


import org.aspectj.lang.annotation.Before;
import org.springframework.http.MediaType;

import com.ramesh.spring.PersonController;
import com.ramesh.spring.model.Person;
import com.ramesh.spring.service.PersonService;


public class PersonControllerTest {
/*
	@InjectMocks
    private PersonController personController;
	
	@InjectMocks
    private PersonService personService;

    private MockMvc mockMvc;
 
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(personController).build();
    }	
    
    @Test
	public void createPerson() throws Exception{
    	// User user = new User("username exists");
    	Person person = new Person();
    	when(personService.exists(person)).thenReturn(false);
        doNothing().when(personService).create(person);
        mockMvc.perform(
                post("/person/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(person)))
                .andExpect(status().isCreated())
                .andExpect(header().string("location", containsString("http://localhost/person/add")));
        verify(personService, times(1)).exists(person);
        verify(personService, times(1)).create(person);
        verifyNoMoreInteractions(personService);	
        }
    
    
  */  
}
