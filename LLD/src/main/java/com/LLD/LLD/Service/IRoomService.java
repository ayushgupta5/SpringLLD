package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Room;

import java.util.List;


public interface IRoomService {
    Room addRoom(Room room);
    Room updateRoom(Integer roomID, Room room);
    void deleteRoom(Integer roomID);
    Room getRoom(Integer roomID);
    List<Room> getRooms();
}
