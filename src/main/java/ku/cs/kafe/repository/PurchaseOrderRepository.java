// 6410450133 nopnapat norasri

package ku.cs.kafe.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ku.cs.kafe.entity.PurchaseOrder;

@Repository
public interface PurchaseOrderRepository
                extends JpaRepository<PurchaseOrder, UUID> {
}
