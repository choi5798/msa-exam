package com.sparta.msa_exam.order;

import java.util.List;

public record OrderResponse(
        Long orderId,
        List<Long> productIds
) {

}
