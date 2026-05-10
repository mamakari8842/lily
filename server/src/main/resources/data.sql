-- タグの初期データ
INSERT INTO tags (tag_name) VALUES ('Java') ON CONFLICT (tag_name) DO NOTHING;
INSERT INTO tags (tag_name) VALUES ('React') ON CONFLICT (tag_name) DO NOTHING;
INSERT INTO tags (tag_name) VALUES ('SpringBoot') ON CONFLICT (tag_name) DO NOTHING;
INSERT INTO tags (tag_name) VALUES ('新人研修') ON CONFLICT (tag_name) DO NOTHING;
INSERT INTO tags (tag_name) VALUES ('資格') ON CONFLICT (tag_name) DO NOTHING;

-- テスト用管理者
INSERT INTO users (user_id, user_name, email, role)
VALUES ('ADMIN_01', '管理者', 'admin@example.com', 'ADMIN') ON CONFLICT (user_id) DO NOTHING;

-- 投稿
INSERT INTO posts (author_id, title, content)
VALUES ('ADMIN_01', '最初の投稿', 'Project Lily のデータベース連携に成功しました！')
ON CONFLICT DO NOTHING;