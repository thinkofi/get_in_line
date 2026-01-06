package com.fastcampus.get_in_line.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIPlaceController {
    ///api/places	GET
    @GetMapping("/places")
    public List<String> getPlaces() {
        return List.of("place1", "place2", "place3");
    }

    ///api/places/{place-id}	GET
    @GetMapping("/places/{placeId}")
    public String getPlace(@PathVariable Integer placeId) {
        return "place: " + placeId;
    }

    ///api/places	POST
    @PostMapping("/places")
    public Boolean createPlace() {
        return true;
    }

    ///api/places/{place-id}	PUT
    @PutMapping("/places/{placeId}")
    public Boolean modifyPlace(@PathVariable Integer placeId) {
        return true;
    }

    ///api/places/{place-id}	DELETE
    @DeleteMapping("/places/placeId")
    public Boolean deletePlace(@PathVariable Integer placeId) {
        return true;
    }
}
