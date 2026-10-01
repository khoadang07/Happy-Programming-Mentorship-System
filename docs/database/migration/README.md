# Database Migrations

Thư mục này chứa các script thay đổi cấu trúc hoặc dữ liệu cơ sở dữ liệu sau khi đã khởi tạo từ `docs/database/init/schema_31_tables.sql`.

## Quy tắc đặt tên file:
```text
YYYYMMDD_<mo_ta_thay_doi>.sql
```

Ví dụ:
- `20261001_add_mentor_headline_index.sql`
- `20261015_alter_payments_failure_code_length.sql`

## Nguyên tắc:
1. File trong `docs/database/init/` luôn được giữ nguyên (immutable).
2. Không chỉnh sửa trực tiếp database mà không có file script migration ghi lại trong thư mục này.
3. Mỗi file migration phải có tính lặp lại an toàn (idempotent / kiểm tra tồn tại trước khi ALTER/CREATE nếu cần).
