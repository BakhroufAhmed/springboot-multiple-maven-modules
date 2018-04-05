package rc.web;

import rc.domain.Hotel;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rc.persistence.HotelRepository;

import java.util.List;

@RestController
public class HotelController {

    private HotelRepository hotelRepository;
@Autowired
    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
@GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels= this.hotelRepository.findAll();
        return hotels;

    }
}
