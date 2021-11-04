-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
--     -- Top 5 mặt hàng có giá bán cao nhất
	select * from mathang where tenmh='Thắt lưng';
    select * from chitietmathang order by GiaBan desc limit 5;
-- 2. Đơn hàng
-- 	-- Được bán trong ngày 28/11/2019
	select * from donhang where day(ThoiGianDatHang)=28 AND  month(ThoiGianDatHang) = 11 AND year(ThoiGianDatHang)=2019;
--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
	select * from donhang where ThoiGianDatHang='2019/11/28' AND ThoiGianDatHang<='2019/12/02';
--     -- Được bán trong tháng 11/2019
	select * from donhang where month(ThoiGianDatHang) = 11 AND year(ThoiGianDatHang)=2019;
--     -- Được giao hàng tại Hòa Khánh
	select * from donhang where DiaChiGiaoHang ='Hòa Khánh';
-- 3.0. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	select mamh, round(GiaBan*(80/100)) as GiaSauKhuyenMai from chitietmathang;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
	select m.MaMH,m.TenMH,d.ThoiGianDatHang,cm.GiaBan*(80/100) as giaGiam from mathang as m, donhang as d, chitietmathang as cm, chitietdonhang as cd where m.MaMH=cd.MaMH and d.MaDH=cd.MaDH and cm.MaMH =m.MaMH and d.ThoiGianDatHang ='2019/11/25';
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
	select mausac from mathang;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
	select m.mamh, m.tenmh, d.ThoiGianDatHang from mathang AS m , donhang as d , chitietdonhang as c where m.MaMH=c.MaMH and d.MaDH=c.MaDH;
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	select m.MaMH, m.TenMH ,c.GiaBan from mathang as m , chitietmathang as c where m.MaMH=c.MaMH and c.GiaBan>=100 and c.GiaBan<=300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	select mathang.MaMH,mathang.TenMH, loaihang.MaLH from mathang inner join loaihang on mathang.MaLH=loaihang.MaLH where  loaihang.TenLH in('Mũ', 'Thắt lưng');
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
	select * from donhang where ThoiGianDatHang in ('2019/11/28','2019/12/14');
-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
	select mathang.MaMH,mathang.TenMH,chitietmathang.GiaBan from mathang inner join chitietmathang on mathang.MaMH= chitietmathang.MaMH order by chitietmathang.GiaBan asc;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
	select mathang.MaMH,mathang.TenMH,chitietmathang.GiaBan from mathang inner join chitietmathang on mathang.MaMH= chitietmathang.MaMH order by chitietmathang.GiaMua desc;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
	select mathang.MaMH,mathang.TenMH,chitietmathang.GiaBan,chitietmathang.GiaMua from mathang inner join chitietmathang on mathang.MaMH= chitietmathang.MaMH order by chitietmathang.GiaBan asc, chitietmathang.GiaMua desc;
-- 14. Đếm số lượng các mặt hàng trong hệ thống
	select count(*) from mathang;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
	select count(*) from ((mathang inner join chitietdonhang on mathang.MaMH=chitietdonhang.MaMH) inner join donhang on chitietdonhang.MaDH=donhang.MaDH) where mathang.TenMH='Giày da Nam' and donhang.ThoiGianDatHang='2019/11/23';
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
	select l.malh,l.tenlh, count(m.malh) as SoLuong from loaihang l inner join mathang m on l.malh = m.malh group by l.malh; 
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
	select mathang.MaMH,mathang.TenMH,chitietmathang.GiaBan from mathang inner join loaihang on mathang.MaLH=loaihang.MaLH inner join chitietmathang on mathang.MaMH= chitietmathang.MaMH where loaihang.TenLH='Giày dép' and chitietmathang.GiaBan = (select max(chitietmathang.GiaBan) from chitietmathang where mathang.mamh=chitietmathang.mamh);
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
	select tenlh,max(giaban) as giabancaonhat from mathang m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh group by l.tenlh;
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
	select tenlh,sum(SoLuong) as TongSL from mathang as m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh group by l.malh;
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng
	select tenlh,sum(SoLuong) as TongSL from mathang as m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh group by l.malh having Tongsl>=20;
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
	select m.TenMH,l.TenLH,max(SoLuong) as LonNhat from mathang as m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh group by l.malh;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
	select l.tenlh,avg(c.giaban) as GiaTrungBinh from mathang as m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh group by l.malh;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
	select l.TenLH,sum(SoLuong) as SoLuong from mathang as m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh group by l.malh order by TongSL desc limit 3;
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
	select m.MaMH,m.TenMH,m.MaLH,c.MaDH from mathang as m inner join chitietdonhang as c on m.MaMH=c.MaMH where m.MaLH=2 and c.MaDH=100100;
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
	select m.MaMH,m.TenMH,m.MaLH,c.MaDH, cd.ThoiGian from mathang as m inner join chitietdonhang as c on m.MaMH=c.MaMH inner join chitiettinhtrangdonhang as cd on c.MaDH=cd.MaDH  where m.MaLH=2 and day(cd.ThoiGian) =28 and month(cd.ThoiGian)=11;
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
	select m.MaMH,m.TenMH,m.MaLH,c.MaDH, cd.ThoiGian from mathang as m inner join loaihang as l on m.MaLH=l.MaLH inner join chitietdonhang as c on m.MaMH=c.MaMH inner join chitiettinhtrangdonhang as cd on c.MaDH=cd.MaDH  where l.TenLH='Mũ' and cd.ThoiGian not in('2019/2/14');
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
	update chitietmathang as c inner join mathang as m on c.MaMH = m.MaMH inner join loaihang as l on m.MaLH=l.malh set c.giaban = 199 where l.tenlh='Áo';
-- 28. Backup data. Tạo table LoaiHang_BACKUP(MaLoai, TenLoai)
--    Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_BACKUP
	use java11_shopping;
    CREATE TABLE LoaiHang_BACKUP(
		Maloai int primary key,
        TenLoai varchar(50)
	);
	insert into loaihang_backup(MaLoai, TenLoai) select malh, tenlh from loaihang;
-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
	select m.MaMH,m.TenMH,m.MaLH,c.MaDH, cd.ThoiGian from mathang as m inner join chitietdonhang as c on m.MaMH=c.MaMH inner join chitiettinhtrangdonhang as cd on c.MaDH=cd.MaDH  where m.MaLH=2 and day(cd.ThoiGian) =23 and month(cd.ThoiGian)=11;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
	select * from mathang as m inner join loaihang as l on m.MaLH=l.MaLH inner join chitietmathang as c on m.MaMH=c.MaMH where (l.TenLH='Áo' and c.SoLuong = (select max(SoLuong) from chitietmathang inner join mathang on chitietmathang.MaMH= mathang.MaMH inner join loaihang on mathang.MaLH=loaihang.MaLH where loaihang.TenLH='Áo')) or (l.TenLH='Quần' and c.SoLuong = (select max(SoLuong) from chitietmathang inner join mathang on chitietmathang.MaMH= mathang.MaMH inner join loaihang on mathang.MaLH=loaihang.MaLH where loaihang.TenLH='Quần'));
-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
	select ct.MaDH, l.TenLH,sum(c.giaban) as TongTien,sum(c.SoLuong) as TongSoLuong from mathang as m inner join chitietmathang c on m.mamh = c.mamh inner join loaihang l on m.malh = l.malh inner join chitietdonhang as ct on m.MaMH=ct.MaMH where ct.MaDH=2  group by l.malh;
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100
	select d.MaDH, concat_ws(':',m.tenmh,cm.giaban,ct.soluong) as ChiTietDonHang, (ct.soluong*cm.GiaBan) as TongTien from mathang as m inner join chitietmathang as cm on m.MaMH=cm.MaMH inner join chitietdonhang as ct on cm.MaMH=ct.MaMH inner join donhang as d on ct.MaDH=d.MaDH where ct.MaDH=2;



