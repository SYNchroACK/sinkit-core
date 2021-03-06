package biz.karms.sinkit.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.*;

/**
 * Created by tom on 11/27/15.
 *
 * @author Tomas Kozel
 */
@Local
public interface GSBService {

    Set<ThreatType> lookup(String url);

    boolean putHashPrefix(String hashPrefix);

    boolean removeHashPrefix(String hashPrefix);

    boolean dropTheWholeCache(boolean async);

    int getStats();
}
