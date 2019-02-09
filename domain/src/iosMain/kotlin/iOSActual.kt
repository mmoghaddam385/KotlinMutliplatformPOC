package com.mogies.domain

import platform.UIKit.UIDevice

actual fun getPlatformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}
