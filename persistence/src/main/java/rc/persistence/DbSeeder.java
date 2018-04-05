package rc.persistence;

import rc.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component 
public class DbSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;
    @Autowired
    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("marriot",4,true);
        Hotel ibis = new Hotel("ibis",5,true);
        Hotel tulip=new Hotel("tulip",4,false);

        List<Hotel> hotels= new ArrayList<>();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(tulip);
        this.hotelRepository.saveAll(hotels);

    }
}
