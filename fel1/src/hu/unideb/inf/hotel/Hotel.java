package hu.unideb.inf.hotel;

import java.util.Objects;

public class Hotel {
    private String hotelName;
    private int rooms;
    private int availableRooms;
    private int bookedRooms;

    /***
     * A hotel osztály konstruktora
     * @param hotelName
     * @param rooms
     * @param availableRooms
     * @param bookedRooms
     */
    public Hotel(String hotelName, int rooms, int availableRooms, int bookedRooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
        this.availableRooms = availableRooms;
        this.bookedRooms = bookedRooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    /**
     * Visszaadja hogy van-e elérhető szoba a szállodában
     * @return van elérhető (true), vagy nincs (false)
     */
    public boolean isRoomAvailable() {
        return availableRooms != 0;
    }

    /***
     * Két hotel egyezik, ha nevük és szobáik száma ugyanaz.
     * @param o
     * @return Boolean: egyezik (true) vagy nem (false)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return rooms == hotel.rooms && Objects.equals(hotelName, hotel.hotelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelName, rooms);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("hotelName='").append(hotelName).append('\'');
        sb.append(", rooms=").append(rooms);
        sb.append(", availableRooms=").append(availableRooms);
        sb.append(", bookedRooms=").append(bookedRooms);
        sb.append('}');
        return sb.toString();
    }
}
