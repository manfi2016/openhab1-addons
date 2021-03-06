/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.primare.internal.protocol.spa20;

/**
 * Supported commands for the Primare sp31.7/SP31/SPA20/SPA21 binding
 *
 * @author Veli-Pekka Juslin
 * @since 1.7.0
 */
public enum PrimareSPA20Command {

    POWER_QUERY,
    POWER_TOGGLE,
    POWER_ON,
    POWER_OFF,
    MAIN_INPUT_QUERY,
    MAIN_INPUT_UP,
    MAIN_INPUT_DOWN,
    MAIN_INPUT_SET,
    VOLUME_QUERY,
    VOLUME_UP,
    VOLUME_DOWN,
    VOLUME_SET,
    BALANCE_QUERY,
    BALANCE_UP,
    BALANCE_DOWN,
    BALANCE_SET,
    CENTER_QUERY,
    CENTER_UP,
    CENTER_DOWN,
    CENTER_SET,
    SURROUND_QUERY,
    SURROUND_UP,
    SURROUND_DOWN,
    SURROUND_SET,
    BACK_QUERY,
    BACK_UP,
    BACK_DOWN,
    BACK_SET,
    SUB_QUERY,
    SUB_UP,
    SUB_DOWN,
    SUB_SET,
    MUTE_QUERY,
    MUTE_TOGGLE,
    MUTE_ON,
    MUTE_OFF,
    DIM_QUERY,
    DIM_TOGGLE,
    DIM_ON,
    DIM_OFF,
    RECORD_INPUT_QUERY,
    RECORD_INPUT_UP,
    RECORD_INPUT_DOWN,
    RECORD_INPUT_SET,
    SURROUND_MODE_QUERY,
    SURROUND_MODE_UP,
    SURROUND_MODE_SET,
    VERBOSE_QUERY,
    VERBOSE_TOGGLE,
    VERBOSE_ON,
    VERBOSE_OFF,
    MENU_QUERY,
    MENU_TOGGLE,
    MENU_SET,
    EXTRA_SURROUND_MODE_QUERY,
    EXTRA_SURROUND_MODE_TOGGLE,
    EXTRA_SURROUND_MODE_ON,
    EXTRA_SURROUND_MODE_OFF,
    FRONT_PANEL_LOCK_QUERY,
    FRONT_PANEL_LOCK_TOGGLE,
    FRONT_PANEL_LOCK_ON,
    FRONT_PANEL_LOCK_OFF,
    IR_INPUT_QUERY,
    IR_INPUT_TOGGLE,
    IR_INPUT_FRONT,
    IR_INPUT_BACK,
    RECALL_MEMORY,
    RECALL_MEMORY_DIRECT_USER_SETTINGS,
    RECALL_MEMORY_DIRECT_FACTORY_SETTINGS,
    RECALL_MEMORY_DIRECT_INSTALLER_SETTINGS,
    CURRENT_INPUT_NAME_QUERY,
    PRODUCTLINE_QUERY,
    MODEL_QUERY,
    SW_VERSION_QUERY,
    LATE_NIGHT_MODE_QUERY,
    LATE_NIGHT_MODE_TOGGLE,
    LATE_NIGHT_MODE_ON,
    LATE_NIGHT_MODE_OFF,
    ALL_QUERY; // Composite command, query all status variables
}
