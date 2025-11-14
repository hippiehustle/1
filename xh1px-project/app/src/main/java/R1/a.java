package R1;

import Z.g;
import o6.j;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class a extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, int i8, int i9) {
        super(i4, i8);
        this.f4994c = i9;
    }

    @Override // y0.AbstractC1829a
    public final void a(D0.a aVar) {
        switch (this.f4994c) {
            case 0:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_left` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_top` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_right` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_bottom` INTEGER DEFAULT NULL");
                return;
            case 1:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `clickOffsetX` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `clickOffsetY` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_message_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_message_text` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_message_counter_name` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_importance` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `event_table` ADD COLUMN `keep_detecting` INTEGER DEFAULT NULL");
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `priority` INTEGER NOT NULL DEFAULT 0");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `scenario_usage_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `last_start_timestamp_ms` INTEGER NOT NULL, `start_count` INTEGER NOT NULL, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_scenario_usage_table_scenario_id` ON `scenario_usage_table` (`scenario_id`)");
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `counter_operation_value_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `counter_operation_counter_name` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `counter_operation_value_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `counter_value_counter_name` TEXT DEFAULT NULL");
                return;
            case g.LONG_FIELD_NUMBER /* 4 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `system_action_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `scenario_table` ADD COLUMN `keep_screen_on` INTEGER NOT NULL DEFAULT 0");
                return;
            case g.STRING_FIELD_NUMBER /* 5 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `text_value` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `text_validate_input` INTEGER DEFAULT NULL");
                return;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `isAdvanced` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `isBroadcast` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `intent_action` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `component_name` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `flags` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `intent_extra_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `action_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, FOREIGN KEY(`action_id`) REFERENCES `action_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_intent_extra_table_action_id` ON `intent_extra_table` (`action_id`)");
                return;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_left` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_top` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_right` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `detection_area_bottom` INTEGER DEFAULT NULL");
                return;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `clickOffsetX` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `clickOffsetY` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_message_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_message_text` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_message_counter_name` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `notification_importance` INTEGER DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `event_table` ADD COLUMN `keep_detecting` INTEGER DEFAULT NULL");
                return;
            case 9:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `priority` INTEGER NOT NULL DEFAULT 0");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `scenario_usage_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `last_start_timestamp_ms` INTEGER NOT NULL, `start_count` INTEGER NOT NULL, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_scenario_usage_table_scenario_id` ON `scenario_usage_table` (`scenario_id`)");
                return;
            case 10:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `counter_operation_value_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `counter_operation_counter_name` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `counter_operation_value_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `condition_table` ADD COLUMN `counter_value_counter_name` TEXT DEFAULT NULL");
                return;
            case 11:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `system_action_type` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `scenario_table` ADD COLUMN `keep_screen_on` INTEGER NOT NULL DEFAULT 0");
                return;
            case 12:
                j.e(aVar, "connection");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `text_value` TEXT DEFAULT NULL");
                E2.b.p(aVar, "ALTER TABLE `action_table` ADD COLUMN `text_validate_input` INTEGER DEFAULT NULL");
                return;
            default:
                j.e(aVar, "connection");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `dumb_scenario_stats_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dumb_scenario_id` INTEGER NOT NULL, `last_start_timestamp_ms` INTEGER NOT NULL, `start_count` INTEGER NOT NULL, FOREIGN KEY(`dumb_scenario_id`) REFERENCES `dumb_scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_dumb_scenario_stats_table_dumb_scenario_id` ON `dumb_scenario_stats_table` (`dumb_scenario_id`)");
                return;
        }
    }
}
