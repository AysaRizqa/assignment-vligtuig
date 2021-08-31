package com.example.assignment.vligtuig;

import com.example.assignment.vligtuig.exception.BadRequest;
import com.example.assignment.vligtuig.model.VliegVield;
import com.example.assignment.vligtuig.model.Vliegtuig;
import com.example.assignment.vligtuig.repository.VliegtuigRepository;
import com.example.assignment.vligtuig.repository.VliegvieldRepository;
import com.example.assignment.vligtuig.service.VliegVieldService;
import com.example.assignment.vligtuig.service.VliegtuigService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
@SpringBootTest
public class VliegtuigServiceTest {

        @InjectMocks
        private VliegVieldService vliegVieldService;

        @Mock
        private VliegvieldRepository vliegvieldRepository;

        @Test
        public void createVliegvieldWithoutLocation() {
            // Arrange.
            VliegVield vliegVield = new VliegVield("Schipol",null, 1);

            // Act.
            try
            {
                VliegVield createNew = this.vliegVieldService.createNewOne(vliegVield);
            }
            catch (BadRequest e) {
                // Assert Exception.
                Assertions.assertEquals(BadRequest.class, e.getClass());
            }
        }

        @Test
        public void createsAirport() {
            // Arrange.
            VliegVield airport = new VliegVield("Rome","Rome", 1);
            Mockito.when(this.vliegvieldRepository.save(airport)).thenReturn(airport);

            // Act.
            VliegVield createdAirport = this.vliegVieldService.createNewOne(airport);

            // Assert.
            Assertions.assertEquals(airport.getName(), createdAirport.getName());
        }



    }


