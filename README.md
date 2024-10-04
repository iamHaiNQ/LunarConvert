# LunarSolarConverter

## Giới thiệu

**LunarSolarConverter** là một ứng dụng Android giúp người dùng chuyển đổi giữa lịch dương và lịch âm. Ứng dụng sử dụng các thuật toán chuyển đổi để tính toán chính xác ngày âm lịch từ ngày dương lịch và ngược lại. Ứng dụng hỗ trợ hai hướng chuyển đổi:
- **Chuyển từ Dương lịch sang Âm lịch**.
- **Chuyển từ Âm lịch sang Dương lịch**.

## Tính năng

1. Chuyển đổi từ ngày dương lịch sang âm lịch.
2. Chuyển đổi từ ngày âm lịch (bao gồm tháng nhuận) sang dương lịch.
3. Giao diện đơn giản, dễ sử dụng.
4. Nhập ngày tháng bằng tay hoặc có thể nâng cấp thêm chức năng chọn ngày (DatePicker).

## Yêu cầu hệ thống

- **Android Studio**: Phiên bản mới nhất.
- **JDK**: Java Development Kit (phiên bản 8 trở lên).
- Thiết bị Android chạy **API 21** trở lên (Android 5.0 - Lollipop).

## Hướng dẫn cài đặt và chạy ứng dụng

1. **Clone hoặc tải project về**:
   ```bash
   git clone https://github.com/your-username/LunarSolarConverter.git
   ```

2. **Mở dự án trong Android Studio**:
   - Mở Android Studio.
   - Chọn "Open an Existing Project" và dẫn tới thư mục dự án vừa tải về.

3. **Kết nối thiết bị Android**:
   - Kết nối điện thoại Android với máy tính hoặc khởi động **Android Emulator** từ Android Studio.

4. **Chạy ứng dụng**:
   - Trong Android Studio, nhấn nút "Run" (hoặc sử dụng phím tắt **Shift + F10**) để biên dịch và cài đặt ứng dụng lên thiết bị Android.

5. **Sử dụng ứng dụng**:
   - Nhập ngày dương lịch để chuyển đổi sang âm lịch.
   - Nhập ngày âm lịch (kèm theo giá trị leap - tháng nhuận nếu có) để chuyển đổi sang dương lịch.

## Cấu trúc dự án

- **MainActivity.java**: Chứa logic xử lý và điều khiển giao diện người dùng (UI).
- **LunarCalendar.java**: Chứa các thuật toán chuyển đổi giữa lịch âm và lịch dương.
- **activity_main.xml**: Giao diện chính của ứng dụng bao gồm các trường nhập liệu và nút bấm chuyển đổi.
- **AndroidManifest.xml**: Định nghĩa các cấu hình chính của ứng dụng.

## Mô tả thuật toán

### Chuyển đổi từ Dương lịch sang Âm lịch
- Tính toán ngày Julius (Julian Day) từ ngày dương lịch.
- Sử dụng các công thức thiên văn để xác định tháng âm lịch tương ứng.
- Trả về ngày âm lịch với định dạng `[day, month, year]`.

### Chuyển đổi từ Âm lịch sang Dương lịch
- Tính ngày Julius từ ngày âm lịch dựa trên số ngày trăng non.
- Xác định khoảng cách giữa các ngày trăng non để tính ra ngày dương lịch tương ứng.
- Trả về ngày dương lịch với định dạng `[day, month, year]`.

## Đóng góp

Nếu bạn muốn đóng góp cho dự án, vui lòng gửi pull request trên GitHub hoặc mở issue để thảo luận về các tính năng mới hoặc lỗi cần sửa.

## Giấy phép

Dự án này được phát hành dưới giấy phép MIT. Vui lòng xem tệp LICENSE để biết thêm chi tiết.
