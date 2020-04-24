package ng.shoppi.mavenproect2.dashboard.service;

import ng.shoppi.mavenproect2.dashboard.domain.Deal;

/**
 *
 * @author babafemi
 */
public interface DealService {
    
    public Deal[] findAll();
    
    public Deal findById(long id);
}
