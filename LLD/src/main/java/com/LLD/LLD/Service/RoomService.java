package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Room;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoomService implements IRoomService{

    @Override
    public Room addRoom(Room room) {
        return null;
    }

    @Override
    public Room updateRoom(Integer roomID, Room room) {
        return null;
    }

    @Override
    public void deleteRoom(Integer roomID) {

    }

    @Override
    public Room getRoom(Integer roomID) {
        return null;
    }

    @Override
    public List<Room> getRooms() {
        return List.of();
    }
}
