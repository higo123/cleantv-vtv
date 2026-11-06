# Bản tuỳ chỉnh: Home chỉ còn 3 icon to: TV trực tiếp, YouTube, YouTube Music

Mặc định BẬT. Sau khi bấm "Cài Home sạch" hoặc "Áp dụng lên tivi":

- Home sạch chỉ còn 3 icon to, tên hiện dưới icon: **TV trực tiếp** (Live TV, cable qua đầu thu của tivi), **YouTube** và **YouTube Music**. Không tự lấp ô trống bằng app khác, không còn hàng app bên dưới, không dải nền dock, không tên dock phía trên. App khác vào Thư viện (nút Thư viện đã ẩn).
- Ẩn lời chào, âm lịch, thời tiết, nút Đang phát, nút màn chờ, hẹn giờ tắt, nút Wi-Fi / Nguồn vào / Thư viện / sắp xếp.
  Giữ bánh răng Cài đặt để vào Wi-Fi và cài đặt tivi. Đồng hồ launcher không có khoá ẩn nên vẫn hiện.
- **Bật tivi mở Live TV ở kênh xem gần nhất** (`boot_to_live_tv` của launcher + `live_tv_package`).
- App tự dò gói Live TV trong danh sách hay gặp (`CheDoVtv.GOI_LIVE_TV`). Không thấy thì ghi cảnh báo; đặt tay ở
  Nâng cao → "App xem truyền hình (Live TV)" bằng tên gói của tivi rồi Áp dụng lại.
- Live TV và YouTube Music không bao giờ bị tắt khi dọn.
- Đã tắt thông báo "có bản app mới" (bản chính thức khác khoá ký và sẽ xoá chế độ này): `BAO_BAN_APP_MOI` trong `CapNhat.kt`.

## Tắt / chỉnh
- Công tắc **"Chỉ Live TV + YouTube Music"** ở mục Tuỳ chỉnh (màn Home sạch).
- Tắt hẳn từ mã nguồn: `CheDoVtv.MAC_DINH = false` (`dulieu/CheDoVtv.kt`).

## Chưa kiểm
Chưa dựng APK, chưa chạy trên tivi thật. `boot_to_live_tv` chỉ chạy ở lần vào Home đầu tiên sau mỗi lần khởi động tivi;
bật lại từ chế độ chờ bằng nút Power có thể không mở Live TV. Cần thử trên tivi thật cả hai trường hợp.

## Ô "TV trực tiếp" và lời chào
- App Live TV của tivi (Xiaomi) không có icon trên Home, nên app dò gói đang nhận link kênh truyền hình (`content://android.media.tv/channel`)
  và đặt một ô riêng "TV trực tiếp" (link_tiles) mở đúng app đó. Chưa kiểm trên tivi thật.
- Lời chào: Home hiện câu chào theo giờ của launcher kèm tên (`CheDoVtv.TEN_CHAO`, mặc định "bà Hương"; đổi ở ô "Tên chào" trong app).
  Launcher không cho đặt nguyên câu tuỳ ý ("Chúc bà Hương một ngày mạnh khỏe") nếu không bật giao diện lễ hội; muốn đúng câu đó phải sửa launcher.
