package R1;

import D2.f;
import o6.j;
import x0.C1772a;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class b extends AbstractC1829a {

    /* renamed from: c, reason: collision with root package name */
    public final G5.e f4995c;

    public b() {
        super(8, 9);
        this.f4995c = new G5.e(7);
    }

    @Override // y0.AbstractC1829a
    public final void a(D0.a aVar) {
        j.e(aVar, "connection");
        E2.b.p(aVar, "ALTER TABLE `event_table` ADD COLUMN `enabled_on_start` INTEGER NOT NULL DEFAULT 1");
        E2.b.p(aVar, "ALTER TABLE `scenario_table` ADD COLUMN `randomize` INTEGER NOT NULL DEFAULT 0");
        E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `_new_action_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `x` INTEGER, `y` INTEGER, `clickOnCondition` INTEGER, `pressDuration` INTEGER, `fromX` INTEGER, `fromY` INTEGER, `toX` INTEGER, `toY` INTEGER, `swipeDuration` INTEGER, `pauseDuration` INTEGER, `isAdvanced` INTEGER, `isBroadcast` INTEGER, `intent_action` TEXT, `component_name` TEXT, `flags` INTEGER, `toggle_event_id` INTEGER, `toggle_type` TEXT, FOREIGN KEY(`eventId`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`toggle_event_id`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        E2.b.p(aVar, "INSERT INTO `_new_action_table` (`id`,`eventId`,`priority`,`name`,`type`,`x`,`y`,`clickOnCondition`,`pressDuration`,`fromX`,`fromY`,`toX`,`toY`,`swipeDuration`,`pauseDuration`,`isAdvanced`,`isBroadcast`,`intent_action`,`component_name`,`flags`) SELECT `id`,`eventId`,`priority`,`name`,`type`,`x`,`y`,`clickOnCondition`,`pressDuration`,`fromX`,`fromY`,`toX`,`toY`,`swipeDuration`,`pauseDuration`,`isAdvanced`,`isBroadcast`,`intent_action`,`component_name`,`flags` FROM `action_table`");
        E2.b.p(aVar, "DROP TABLE `action_table`");
        E2.b.p(aVar, "ALTER TABLE `_new_action_table` RENAME TO `action_table`");
        E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_action_table_eventId` ON `action_table` (`eventId`)");
        E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_action_table_toggle_event_id` ON `action_table` (`toggle_event_id`)");
        E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `_new_event_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `operator` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `enabled_on_start` INTEGER NOT NULL DEFAULT 1, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        E2.b.p(aVar, "INSERT INTO `_new_event_table` (`id`,`scenario_id`,`name`,`operator`,`priority`) SELECT `id`,`scenario_id`,`name`,`operator`,`priority` FROM `event_table`");
        E2.b.p(aVar, "DROP TABLE `event_table`");
        E2.b.p(aVar, "ALTER TABLE `_new_event_table` RENAME TO `event_table`");
        E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_table_scenario_id` ON `event_table` (`scenario_id`)");
        f.n(aVar, "action_table");
        f.n(aVar, "event_table");
        this.f4995c.getClass();
        if (aVar instanceof C1772a) {
            j.e(((C1772a) aVar).f16079d, "db");
        }
    }
}
