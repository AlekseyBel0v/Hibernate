package com.belov.hibernate.domain;

import jakarta.persistence.*;
import lombok.*;
import net.sf.jsqlparser.statement.create.table.ColumnDefinition;
import org.hibernate.annotations.Check;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "ORDERS", schema = "netology")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private long id;
    @Column(nullable = false)
    private String date;
    /*
    При FetchType.LAZY в случае получения объекта ордер (состояние персистент) объект кастомер не будет
    загружаться по умолчанию (по умолчанию выбирается жадная стратегия). В дальнейшем, чтобы загрузить
    кастомер вместе с ордером, надо
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    private Customer customer;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "amount", columnDefinition = "float4")
    private Float amount;

    public Order() {
    }
}