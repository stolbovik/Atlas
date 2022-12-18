package org.atlas.Resources;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class UserInfo {
    @NotNull
    private final String name;
    @NotNull
    private final String id;
}
