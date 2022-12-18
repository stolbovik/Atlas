package org.atlas.Resources;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Test bot info for login in system
 */
@Data
public class TestBot {
    @NotNull
    private final String login;
    @NotNull
    private final String password;
    @NotNull
    private final String id;
}
