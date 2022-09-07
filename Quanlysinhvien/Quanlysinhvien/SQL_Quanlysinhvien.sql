create database Quanlysinhvien
GO
USE Quanlysinhvien
GO

CREATE TABLE [dbo].[User](
	[username] [nvarchar](50) NOT NULL primary key,
	[password] [nvarchar](50) NULL,
	[role] [varchar](10) NULL,
	[email] [nvarchar](50) NULL,
 )
GO

CREATE TABLE [dbo].[lop](
	[malop] [nvarchar](50) NOT NULL primary key ,
	[tenlop] [nvarchar](50) NULL,
)
GO

CREATE TABLE [dbo].[SinhVien](
	[masv] [nvarchar](10) NOT NULL primary key,
	[tensv] [nvarchar](50) NULL,
	[gioitinh] [bit] NULL,
	[sdt] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[diachi] [nvarchar](50) NULL,
	[malop] [nvarchar](50) NULL,
 CONSTRAINT fk_sv_malop
  FOREIGN KEY (malop)
  REFERENCES lop (malop) 
  ON DELETE SET NULL 
 
);

CREATE TABLE [dbo].[grade](
	[id] [int] IDENTITY(1,1) NOT NULL primary key,
	[masv] [nvarchar](10) NULL,
	[Toan] [float] NULL,
	[Java] [float] NULL,
	[TiengAnh] [float] NULL,
	 CONSTRAINT fk_diem_masv
  FOREIGN KEY (masv)
  REFERENCES SinhVien (masv) 
  ON DELETE cascade
 
);
GO

INSERT INTO [Quanlysinhvien].[dbo].[User] (username,password,role,email) values(N'nghia1',N'1',N'admin',N'nguyenminhnghia722001@gmail.com')
INSERT INTO [Quanlysinhvien].[dbo].[User] (username,password,role,email) values(N'nghia2',N'1',N'user',N'nguyenminhnghia722001@gmail.com')
INSERT INTO [Quanlysinhvien].[dbo].[User] (username,password,role,email) values(N'nghia3',N'1',N'user',N'nguyenminhnghia722001@gmail.com')