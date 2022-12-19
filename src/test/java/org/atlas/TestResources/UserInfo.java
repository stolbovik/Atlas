package org.atlas.TestResources;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Info about user for adding he/she to bookmarks
 */
@Data
public class UserInfo {
    @NotNull
    private final String name;
    @NotNull
    private final String id;
}
