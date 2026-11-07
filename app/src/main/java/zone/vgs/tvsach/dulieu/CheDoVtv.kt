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
        // Xiaomi: Google TV (MOEU0, MOSR4, MOOR2/4, MOOR0…), MediaTek (MSSP0-3), Amlogic (MiTV4I), Amlogic Android TV 9/11 (AXSO0, AXFR)
        "com.mitv.livetv", "com.mediatek.wwtv.tvcenter", "com.droidlogic.droidlivetv", "com.android.tv",
        "com.google.android.tv", "com.google.android.tvtuner", "com.xiaomi.mitv.tvplayer", "com.mediatek.tv",
        "com.sony.dtv.tvx", "com.tcl.tv", "com.tcl.livetv", "com.tcl.tvlive", "com.droidlogic.tv", "com.skyworth.tv", "com.mstar.tv.tvplayer.ui",
        "com.realtek.tv", "com.hisense.tv", "com.panasonic.tv", "com.philips.tv",
    )

    /** Tên gói trông giống app xem truyền hình, dùng khi gói trên tivi không nằm trong danh sách trên. */
    val MAU_LIVE_TV = Regex("livetv|tvcenter|droidlivetv|tvtuner|tv\\.tvplayer", RegexOption.IGNORE_CASE)

    /** false = bỏ icon YouTube, Home chỉ còn TV trực tiếp + YouTube Music (nếu 3 icon vẫn không vừa màn hình). */
    const val CO_YOUTUBE = true

    /** Số cột của Home: 4 cột cho 3 icon nằm cùng một hàng, mỗi ô to hơn bản 5 cột (3 = to nhất, vừa khít 3 icon). */
    const val SO_COT = 4

    /** Cỡ chữ đồng hồ, lời chào, ngày, thời tiết (%): 100 vừa, 125 lớn, 150 rất lớn. */
    const val CO_CHU_DAU = 150

    /** Thành phố thời tiết mặc định (tên trong THANH_PHO) khi người dùng chưa chọn. */
    const val THANH_PHO = "Hà Nội"

    /** Tên hiện trong lời chào trên Home (launcher ghép với câu chào theo giờ). Đổi ở đây hoặc ở ô "Tên chào" trong app. */
    const val TEN_CHAO = "bà Hương"

    /** YouTube (bản Android TV trước). */
    val GOI_YOUTUBE = listOf("com.google.android.youtube.tv", "com.google.android.youtube.tvunplugged", "com.google.android.youtube")

    /** YouTube Music: bản Android TV trước, hộp / máy chiếu dùng bản điện thoại thì lấy bản đó. */
    val GOI_YT_MUSIC = listOf("com.google.android.youtube.tvmusic", "com.google.android.apps.youtube.music")

    /** Gói không bao giờ bị tắt khi dọn trong chế độ này (xem KeHoach.laGoiCanGiu). */
    val GOI_GIU = (GOI_LIVE_TV + GOI_YOUTUBE + GOI_YT_MUSIC).toSet()

    /** Giữ OK (hoặc bấm phím Menu) trên một icon ở Home để Di chuyển / Bỏ khỏi màn hình chính / Thông tin app. */
    /** Tối đa số icon trên Home; icon thứ 5 bị từ chối im lặng (cần launcher đã vá: patches/launcher-vgs-gioi-han.patch). */
    const val TOI_DA_ICON = 4

    val CHO_BO_ICON = mapOf("tile_menu" to "true")

    /** Khoá Nâng cao ẩn các nút trên Home sạch. Vẫn giữ nút bánh răng Cài đặt để vào Wi-Fi / cài đặt tivi khi cần. */
    val AN_NUT = mapOf(
        "show_network_pill" to "false", "show_inputs_pill" to "false",
        "reorder_button" to "false", "show_home_settings_shortcut" to "false",
        // Không tự lấp ô dock trống bằng app khác, không hàng app dưới dock, bỏ dải nền dock.
        "fill_dock" to "false", "rows_below_dock" to "0", "dock_band" to "false",
    )
}
