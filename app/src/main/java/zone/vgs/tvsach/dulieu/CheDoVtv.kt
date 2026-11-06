package zone.vgs.tvsach.dulieu

/**
 * Bản tuỳ chỉnh (06/11/2026): sau khi cài, Home sạch chỉ còn 3 icon to: TV trực tiếp (Live TV, cable qua đầu thu của tivi), YouTube và
 * YouTube Music; bật tivi là mở Live TV ở kênh xem gần nhất. Tắt hẳn bằng MAC_DINH = false, hoặc công tắc
 * "Chỉ Live TV + YouTube Music" ở mục Tuỳ chỉnh trong app.
 */
object CheDoVtv {
    const val MAC_DINH = true

    /** Gói app Live TV hay gặp trên Android TV (bộ thu DVB-C / DVB-T của tivi), lấy cái đầu tiên có trên tivi. Không thấy thì đặt tay ở Nâng cao: live_tv_package. */
    val GOI_LIVE_TV = listOf(
        "com.google.android.tv", "com.android.tv", "com.google.android.tvtuner", "com.xiaomi.mitv.tvplayer", "com.mediatek.tv",
        "com.sony.dtv.tvx", "com.tcl.tv", "com.tcl.livetv", "com.tcl.tvlive", "com.droidlogic.tv", "com.skyworth.tv", "com.mstar.tv.tvplayer.ui",
        "com.realtek.tv", "com.hisense.tv", "com.panasonic.tv", "com.philips.tv",
    )

    /** Tên hiện trong lời chào trên Home (launcher ghép với câu chào theo giờ). Đổi ở đây hoặc ở ô "Tên chào" trong app. */
    const val TEN_CHAO = "bà Hương"

    /** YouTube (bản Android TV trước). */
    val GOI_YOUTUBE = listOf("com.google.android.youtube.tv", "com.google.android.youtube.tvunplugged", "com.google.android.youtube")

    /** YouTube Music: bản Android TV trước, hộp / máy chiếu dùng bản điện thoại thì lấy bản đó. */
    val GOI_YT_MUSIC = listOf("com.google.android.youtube.tvmusic", "com.google.android.apps.youtube.music")

    /** Gói không bao giờ bị tắt khi dọn trong chế độ này (xem KeHoach.laGoiCanGiu). */
    val GOI_GIU = (GOI_LIVE_TV + GOI_YOUTUBE + GOI_YT_MUSIC).toSet()

    /** Khoá Nâng cao ẩn các nút trên Home sạch. Vẫn giữ nút bánh răng Cài đặt để vào Wi-Fi / cài đặt tivi khi cần. */
    val AN_NUT = mapOf(
        "show_network_pill" to "false", "show_inputs_pill" to "false", "show_library_pill" to "false",
        "reorder_button" to "false", "show_home_settings_shortcut" to "false",
        // Không tự lấp ô dock trống bằng app khác, không hàng app dưới dock, bỏ dải nền dock.
        "fill_dock" to "false", "rows_below_dock" to "0", "dock_band" to "false",
    )
}
