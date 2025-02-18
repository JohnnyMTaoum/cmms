package com.grash.dto.analytics.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestStatsByPriority {
    private BasicStats none;
    private BasicStats low;
    private BasicStats medium;
    private BasicStats high;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BasicStats {
        private int count;
    }
}
