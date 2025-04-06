package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Room;
import com.LLD.LLD.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoomService implements IRoomService{
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room updateRoom(Integer roomID, Room room) {
        Room roomObject = roomRepository.findById(roomID).get();
        roomObject.setRoomNumber(room.getRoomNumber());
        roomObject.setAvailable(room.isAvailable());
        roomObject.setPricePerNight(room.getPricePerNight());
        roomObject.setRoomType(room.getRoomType());

        return roomRepository.save(roomObject);
    }

    @Override
    public void deleteRoom(Integer roomID) {
        roomRepository.deleteById(roomID);
    }

    @Override
    public Room getRoom(Integer roomID) {
        return roomRepository.findById(roomID).get();
    }

    @Override
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }
}
