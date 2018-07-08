package org.columbia.dto;

import java.util.List;

public class RumorListDto {

    private List<RumorIdDto> rumors;

    public List<RumorIdDto> getRumors() {
        return rumors;
    }

    public void setRumors(List<RumorIdDto> rumors) {
        this.rumors = rumors;
    }
}
