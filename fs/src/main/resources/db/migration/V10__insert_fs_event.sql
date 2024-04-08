INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单审批完成', 'com.fit2cloud.oss.event.FsEvent', 'folder_create', -1, 'PROCESS', NULL, 'COMPLETE', 'APPROVED', 'xsky-fs');
INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单中止', 'com.fit2cloud.oss.event.FsEvent', 'folder_create', -1, 'PROCESS', NULL, 'TERMINATE', 'REJECTED', 'xsky-fs');

INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单审批完成', 'com.fit2cloud.oss.event.FsEvent', 'folder_update', -1, 'PROCESS', NULL, 'COMPLETE', 'APPROVED', 'xsky-fs');
INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单中止', 'com.fit2cloud.oss.event.FsEvent', 'folder_update', -1, 'PROCESS', NULL, 'TERMINATE', 'REJECTED', 'xsky-fs');

INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单审批完成', 'com.fit2cloud.oss.event.FsEvent', 'folder_delete', -1, 'PROCESS', NULL, 'COMPLETE', 'APPROVED', 'xsky-fs');
INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单中止', 'com.fit2cloud.oss.event.FsEvent', 'folder_delete', -1, 'PROCESS', NULL, 'TERMINATE', 'REJECTED', 'xsky-fs');

INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单审批完成', 'com.fit2cloud.oss.event.FsEvent', 'share_create', -1, 'PROCESS', NULL, 'COMPLETE', 'APPROVED', 'xsky-fs');
INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单中止', 'com.fit2cloud.oss.event.FsEvent', 'share_create', -1, 'PROCESS', NULL, 'TERMINATE', 'REJECTED', 'xsky-fs');

INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单审批完成', 'com.fit2cloud.oss.event.FsEvent', 'share_update', -1, 'PROCESS', NULL, 'COMPLETE', 'APPROVED', 'xsky-fs');
INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单中止', 'com.fit2cloud.oss.event.FsEvent', 'share_update', -1, 'PROCESS', NULL, 'TERMINATE', 'REJECTED', 'xsky-fs');

INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单审批完成', 'com.fit2cloud.oss.event.FsEvent', 'share_delete', -1, 'PROCESS', NULL, 'COMPLETE', 'APPROVED', 'xsky-fs');
INSERT INTO flow_event (name, executor, model_id, step, type, position, operation, arguments, module)
VALUES ('订单中止', 'com.fit2cloud.oss.event.FsEvent', 'share_delete', -1, 'PROCESS', NULL, 'TERMINATE', 'REJECTED', 'xsky-fs');
