package org.bjtu.cms.bjtucms.log

import org.slf4j.LoggerFactory

object MyLogger {

    private const val TAG = "BJTU_CMS"
    private val logger = LoggerFactory.getLogger(TAG)

    fun i(msg: String) = logger.info("  ----> $msg")
    fun e(msg: String) = logger.error(msg)
    fun e(throwable: Throwable, msg: String) = logger.error(msg, throwable)
}


