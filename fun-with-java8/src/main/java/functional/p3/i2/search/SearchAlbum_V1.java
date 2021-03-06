package functional.p3.i2.search;

import functional.p3.i1.filter.Album;

import java.util.List;
import java.util.stream.Collectors;

import static functional.p3.i1.filter.AlbumRegistry.ALBUMS;
import static functional.p3.i1.filter.AlbumUtil.println;
import static functional.p3.i2.search.Filter.*;


/**
 * @author victorp
 */
public class SearchAlbum_V1 {

    public static List<Album> searchByName(List<Album> albums, String name){
        return albums.stream()
                .filter(byName(name))
                .collect(Collectors.toList());

    }

    public static List<Album> searchByYear(List<Album> albums, int year){
        return albums.stream()
                .filter(byYear(year))
                .collect(Collectors.toList());

    }


    public static void main(String... args) {
        println(
                searchByName(ALBUMS,"The Wall"), "(v1) searchByName:");

        System.out.println();

        println(
                searchByYear(ALBUMS, 1977), "(v1) searchByYear:");

    }


}
