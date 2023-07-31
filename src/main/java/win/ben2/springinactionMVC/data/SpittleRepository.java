package win.ben2.springinactionMVC.data;

import win.ben2.springinactionMVC.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
