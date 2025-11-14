package R1;

import A0.k;
import A0.l;
import A0.m;
import N.f;
import c0.g;
import com.buzbuz.smartautoclicker.core.database.ClickDatabase_Impl;
import com.buzbuz.smartautoclicker.core.database.TutorialDatabase_Impl;
import com.buzbuz.smartautoclicker.core.dumb.data.database.DumbDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import o6.j;
import u0.u;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4998d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f4999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DumbDatabase_Impl dumbDatabase_Impl) {
        super(2, "cc7915adef5aec5cd62afca3a1a6ec74", "a0f1e864b041c60c120471fbe8f2061a");
        this.f4999e = dumbDatabase_Impl;
    }

    private final f w(D0.a aVar) {
        j.e(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("eventId", new A0.j("eventId", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("priority", new A0.j("priority", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap.put("clickPositionType", new A0.j("clickPositionType", "TEXT", false, 0, null, 1));
        linkedHashMap.put("x", new A0.j("x", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("y", new A0.j("y", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("clickOnConditionId", new A0.j("clickOnConditionId", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("pressDuration", new A0.j("pressDuration", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("clickOffsetX", new A0.j("clickOffsetX", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("clickOffsetY", new A0.j("clickOffsetY", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("fromX", new A0.j("fromX", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("fromY", new A0.j("fromY", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toX", new A0.j("toX", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toY", new A0.j("toY", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("swipeDuration", new A0.j("swipeDuration", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("pauseDuration", new A0.j("pauseDuration", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("isAdvanced", new A0.j("isAdvanced", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("isBroadcast", new A0.j("isBroadcast", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("intent_action", new A0.j("intent_action", "TEXT", false, 0, null, 1));
        linkedHashMap.put("component_name", new A0.j("component_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("flags", new A0.j("flags", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toggle_all", new A0.j("toggle_all", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toggle_all_type", new A0.j("toggle_all_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_name", new A0.j("counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_operation", new A0.j("counter_operation", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_operation_value_type", new A0.j("counter_operation_value_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_operation_value", new A0.j("counter_operation_value", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("counter_operation_counter_name", new A0.j("counter_operation_counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_message_type", new A0.j("notification_message_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_message_text", new A0.j("notification_message_text", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_message_counter_name", new A0.j("notification_message_counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_importance", new A0.j("notification_importance", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("system_action_type", new A0.j("system_action_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("text_value", new A0.j("text_value", "TEXT", false, 0, null, 1));
        linkedHashMap.put("text_validate_input", new A0.j("text_validate_input", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new k("event_table", "CASCADE", "NO ACTION", E2.d.y("eventId"), E2.d.y("id")));
        linkedHashSet.add(new k("condition_table", "SET NULL", "NO ACTION", E2.d.y("clickOnConditionId"), E2.d.y("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new l("index_action_table_eventId", false, E2.d.y("eventId"), E2.d.y("ASC")));
        linkedHashSet2.add(new l("index_action_table_clickOnConditionId", false, E2.d.y("clickOnConditionId"), E2.d.y("ASC")));
        m mVar = new m("action_table", linkedHashMap, linkedHashSet, linkedHashSet2);
        m G8 = D2.f.G(aVar, "action_table");
        if (!mVar.equals(G8)) {
            return new f("action_table(com.buzbuz.smartautoclicker.core.database.entity.ActionEntity).\n Expected:\n" + mVar + "\n Found:\n" + G8, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("scenario_id", new A0.j("scenario_id", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("operator", new A0.j("operator", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("priority", new A0.j("priority", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("enabled_on_start", new A0.j("enabled_on_start", "INTEGER", true, 0, "1", 1));
        linkedHashMap2.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("keep_detecting", new A0.j("keep_detecting", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new k("scenario_table", "CASCADE", "NO ACTION", E2.d.y("scenario_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new l("index_event_table_scenario_id", false, E2.d.y("scenario_id"), E2.d.y("ASC")));
        m mVar2 = new m("event_table", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        m G9 = D2.f.G(aVar, "event_table");
        if (!mVar2.equals(G9)) {
            return new f("event_table(com.buzbuz.smartautoclicker.core.database.entity.EventEntity).\n Expected:\n" + mVar2 + "\n Found:\n" + G9, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("detection_quality", new A0.j("detection_quality", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("randomize", new A0.j("randomize", "INTEGER", true, 0, "0", 1));
        linkedHashMap3.put("keep_screen_on", new A0.j("keep_screen_on", "INTEGER", true, 0, "0", 1));
        m mVar3 = new m("scenario_table", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        m G10 = D2.f.G(aVar, "scenario_table");
        if (!mVar3.equals(G10)) {
            return new f("scenario_table(com.buzbuz.smartautoclicker.core.database.entity.ScenarioEntity).\n Expected:\n" + mVar3 + "\n Found:\n" + G10, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("eventId", new A0.j("eventId", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("priority", new A0.j("priority", "INTEGER", true, 0, "0", 1));
        linkedHashMap4.put("path", new A0.j("path", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("area_left", new A0.j("area_left", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("area_top", new A0.j("area_top", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("area_right", new A0.j("area_right", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("area_bottom", new A0.j("area_bottom", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("threshold", new A0.j("threshold", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_type", new A0.j("detection_type", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("shouldBeDetected", new A0.j("shouldBeDetected", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_left", new A0.j("detection_area_left", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_top", new A0.j("detection_area_top", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_right", new A0.j("detection_area_right", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_bottom", new A0.j("detection_area_bottom", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("broadcast_action", new A0.j("broadcast_action", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_name", new A0.j("counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_comparison_operation", new A0.j("counter_comparison_operation", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_operation_value_type", new A0.j("counter_operation_value_type", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_value", new A0.j("counter_value", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("counter_value_counter_name", new A0.j("counter_value_counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("timer_value_ms", new A0.j("timer_value_ms", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("timer_restart_when_reached", new A0.j("timer_restart_when_reached", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new k("event_table", "CASCADE", "NO ACTION", E2.d.y("eventId"), E2.d.y("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new l("index_condition_table_eventId", false, E2.d.y("eventId"), E2.d.y("ASC")));
        m mVar4 = new m("condition_table", linkedHashMap4, linkedHashSet5, linkedHashSet6);
        m G11 = D2.f.G(aVar, "condition_table");
        if (!mVar4.equals(G11)) {
            return new f("condition_table(com.buzbuz.smartautoclicker.core.database.entity.ConditionEntity).\n Expected:\n" + mVar4 + "\n Found:\n" + G11, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("action_id", new A0.j("action_id", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("key", new A0.j("key", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("value", new A0.j("value", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new k("action_table", "CASCADE", "NO ACTION", E2.d.y("action_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new l("index_intent_extra_table_action_id", false, E2.d.y("action_id"), E2.d.y("ASC")));
        m mVar5 = new m("intent_extra_table", linkedHashMap5, linkedHashSet7, linkedHashSet8);
        m G12 = D2.f.G(aVar, "intent_extra_table");
        if (!mVar5.equals(G12)) {
            return new f("intent_extra_table(com.buzbuz.smartautoclicker.core.database.entity.IntentExtraEntity).\n Expected:\n" + mVar5 + "\n Found:\n" + G12, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap6.put("action_id", new A0.j("action_id", "INTEGER", true, 0, null, 1));
        linkedHashMap6.put("toggle_type", new A0.j("toggle_type", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("toggle_event_id", new A0.j("toggle_event_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new k("action_table", "CASCADE", "NO ACTION", E2.d.y("action_id"), E2.d.y("id")));
        linkedHashSet9.add(new k("event_table", "CASCADE", "NO ACTION", E2.d.y("toggle_event_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new l("index_event_toggle_table_action_id", false, E2.d.y("action_id"), E2.d.y("ASC")));
        linkedHashSet10.add(new l("index_event_toggle_table_toggle_event_id", false, E2.d.y("toggle_event_id"), E2.d.y("ASC")));
        m mVar6 = new m("event_toggle_table", linkedHashMap6, linkedHashSet9, linkedHashSet10);
        m G13 = D2.f.G(aVar, "event_toggle_table");
        if (!mVar6.equals(G13)) {
            return new f("event_toggle_table(com.buzbuz.smartautoclicker.core.database.entity.EventToggleEntity).\n Expected:\n" + mVar6 + "\n Found:\n" + G13, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap7.put("scenario_id", new A0.j("scenario_id", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("last_start_timestamp_ms", new A0.j("last_start_timestamp_ms", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("start_count", new A0.j("start_count", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new k("scenario_table", "CASCADE", "NO ACTION", E2.d.y("scenario_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new l("index_scenario_usage_table_scenario_id", false, E2.d.y("scenario_id"), E2.d.y("ASC")));
        m mVar7 = new m("scenario_usage_table", linkedHashMap7, linkedHashSet11, linkedHashSet12);
        m G14 = D2.f.G(aVar, "scenario_usage_table");
        if (!mVar7.equals(G14)) {
            return new f("scenario_usage_table(com.buzbuz.smartautoclicker.core.database.entity.ScenarioStatsEntity).\n Expected:\n" + mVar7 + "\n Found:\n" + G14, false);
        }
        return new f((String) null, true);
    }

    private final f x(D0.a aVar) {
        j.e(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("eventId", new A0.j("eventId", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("priority", new A0.j("priority", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap.put("clickPositionType", new A0.j("clickPositionType", "TEXT", false, 0, null, 1));
        linkedHashMap.put("x", new A0.j("x", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("y", new A0.j("y", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("clickOnConditionId", new A0.j("clickOnConditionId", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("pressDuration", new A0.j("pressDuration", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("clickOffsetX", new A0.j("clickOffsetX", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("clickOffsetY", new A0.j("clickOffsetY", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("fromX", new A0.j("fromX", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("fromY", new A0.j("fromY", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toX", new A0.j("toX", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toY", new A0.j("toY", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("swipeDuration", new A0.j("swipeDuration", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("pauseDuration", new A0.j("pauseDuration", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("isAdvanced", new A0.j("isAdvanced", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("isBroadcast", new A0.j("isBroadcast", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("intent_action", new A0.j("intent_action", "TEXT", false, 0, null, 1));
        linkedHashMap.put("component_name", new A0.j("component_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("flags", new A0.j("flags", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toggle_all", new A0.j("toggle_all", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("toggle_all_type", new A0.j("toggle_all_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_name", new A0.j("counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_operation", new A0.j("counter_operation", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_operation_value_type", new A0.j("counter_operation_value_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("counter_operation_value", new A0.j("counter_operation_value", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("counter_operation_counter_name", new A0.j("counter_operation_counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_message_type", new A0.j("notification_message_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_message_text", new A0.j("notification_message_text", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_message_counter_name", new A0.j("notification_message_counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("notification_importance", new A0.j("notification_importance", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("system_action_type", new A0.j("system_action_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("text_value", new A0.j("text_value", "TEXT", false, 0, null, 1));
        linkedHashMap.put("text_validate_input", new A0.j("text_validate_input", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new k("event_table", "CASCADE", "NO ACTION", E2.d.y("eventId"), E2.d.y("id")));
        linkedHashSet.add(new k("condition_table", "SET NULL", "NO ACTION", E2.d.y("clickOnConditionId"), E2.d.y("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new l("index_action_table_eventId", false, E2.d.y("eventId"), E2.d.y("ASC")));
        linkedHashSet2.add(new l("index_action_table_clickOnConditionId", false, E2.d.y("clickOnConditionId"), E2.d.y("ASC")));
        m mVar = new m("action_table", linkedHashMap, linkedHashSet, linkedHashSet2);
        m G8 = D2.f.G(aVar, "action_table");
        if (!mVar.equals(G8)) {
            return new f("action_table(com.buzbuz.smartautoclicker.core.database.entity.ActionEntity).\n Expected:\n" + mVar + "\n Found:\n" + G8, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("scenario_id", new A0.j("scenario_id", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("operator", new A0.j("operator", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("priority", new A0.j("priority", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("enabled_on_start", new A0.j("enabled_on_start", "INTEGER", true, 0, "1", 1));
        linkedHashMap2.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("keep_detecting", new A0.j("keep_detecting", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new k("scenario_table", "CASCADE", "NO ACTION", E2.d.y("scenario_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new l("index_event_table_scenario_id", false, E2.d.y("scenario_id"), E2.d.y("ASC")));
        m mVar2 = new m("event_table", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        m G9 = D2.f.G(aVar, "event_table");
        if (!mVar2.equals(G9)) {
            return new f("event_table(com.buzbuz.smartautoclicker.core.database.entity.EventEntity).\n Expected:\n" + mVar2 + "\n Found:\n" + G9, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("detection_quality", new A0.j("detection_quality", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("randomize", new A0.j("randomize", "INTEGER", true, 0, "0", 1));
        linkedHashMap3.put("keep_screen_on", new A0.j("keep_screen_on", "INTEGER", true, 0, "0", 1));
        m mVar3 = new m("scenario_table", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        m G10 = D2.f.G(aVar, "scenario_table");
        if (!mVar3.equals(G10)) {
            return new f("scenario_table(com.buzbuz.smartautoclicker.core.database.entity.ScenarioEntity).\n Expected:\n" + mVar3 + "\n Found:\n" + G10, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("eventId", new A0.j("eventId", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("priority", new A0.j("priority", "INTEGER", true, 0, "0", 1));
        linkedHashMap4.put("path", new A0.j("path", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("area_left", new A0.j("area_left", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("area_top", new A0.j("area_top", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("area_right", new A0.j("area_right", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("area_bottom", new A0.j("area_bottom", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("threshold", new A0.j("threshold", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_type", new A0.j("detection_type", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("shouldBeDetected", new A0.j("shouldBeDetected", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_left", new A0.j("detection_area_left", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_top", new A0.j("detection_area_top", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_right", new A0.j("detection_area_right", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("detection_area_bottom", new A0.j("detection_area_bottom", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("broadcast_action", new A0.j("broadcast_action", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_name", new A0.j("counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_comparison_operation", new A0.j("counter_comparison_operation", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_operation_value_type", new A0.j("counter_operation_value_type", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("counter_value", new A0.j("counter_value", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("counter_value_counter_name", new A0.j("counter_value_counter_name", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("timer_value_ms", new A0.j("timer_value_ms", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("timer_restart_when_reached", new A0.j("timer_restart_when_reached", "INTEGER", false, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new k("event_table", "CASCADE", "NO ACTION", E2.d.y("eventId"), E2.d.y("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new l("index_condition_table_eventId", false, E2.d.y("eventId"), E2.d.y("ASC")));
        m mVar4 = new m("condition_table", linkedHashMap4, linkedHashSet5, linkedHashSet6);
        m G11 = D2.f.G(aVar, "condition_table");
        if (!mVar4.equals(G11)) {
            return new f("condition_table(com.buzbuz.smartautoclicker.core.database.entity.ConditionEntity).\n Expected:\n" + mVar4 + "\n Found:\n" + G11, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("action_id", new A0.j("action_id", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("key", new A0.j("key", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("value", new A0.j("value", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new k("action_table", "CASCADE", "NO ACTION", E2.d.y("action_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new l("index_intent_extra_table_action_id", false, E2.d.y("action_id"), E2.d.y("ASC")));
        m mVar5 = new m("intent_extra_table", linkedHashMap5, linkedHashSet7, linkedHashSet8);
        m G12 = D2.f.G(aVar, "intent_extra_table");
        if (!mVar5.equals(G12)) {
            return new f("intent_extra_table(com.buzbuz.smartautoclicker.core.database.entity.IntentExtraEntity).\n Expected:\n" + mVar5 + "\n Found:\n" + G12, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap6.put("action_id", new A0.j("action_id", "INTEGER", true, 0, null, 1));
        linkedHashMap6.put("toggle_type", new A0.j("toggle_type", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("toggle_event_id", new A0.j("toggle_event_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new k("action_table", "CASCADE", "NO ACTION", E2.d.y("action_id"), E2.d.y("id")));
        linkedHashSet9.add(new k("event_table", "CASCADE", "NO ACTION", E2.d.y("toggle_event_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new l("index_event_toggle_table_action_id", false, E2.d.y("action_id"), E2.d.y("ASC")));
        linkedHashSet10.add(new l("index_event_toggle_table_toggle_event_id", false, E2.d.y("toggle_event_id"), E2.d.y("ASC")));
        m mVar6 = new m("event_toggle_table", linkedHashMap6, linkedHashSet9, linkedHashSet10);
        m G13 = D2.f.G(aVar, "event_toggle_table");
        if (!mVar6.equals(G13)) {
            return new f("event_toggle_table(com.buzbuz.smartautoclicker.core.database.entity.EventToggleEntity).\n Expected:\n" + mVar6 + "\n Found:\n" + G13, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("tutorial_index", new A0.j("tutorial_index", "INTEGER", true, 1, null, 1));
        linkedHashMap7.put("scenario_id", new A0.j("scenario_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new k("scenario_table", "CASCADE", "NO ACTION", E2.d.y("scenario_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new l("index_tutorial_success_table_scenario_id", false, E2.d.y("scenario_id"), E2.d.y("ASC")));
        m mVar7 = new m("tutorial_success_table", linkedHashMap7, linkedHashSet11, linkedHashSet12);
        m G14 = D2.f.G(aVar, "tutorial_success_table");
        if (!mVar7.equals(G14)) {
            return new f("tutorial_success_table(com.buzbuz.smartautoclicker.core.database.entity.TutorialSuccessEntity).\n Expected:\n" + mVar7 + "\n Found:\n" + G14, false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
        linkedHashMap8.put("scenario_id", new A0.j("scenario_id", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("last_start_timestamp_ms", new A0.j("last_start_timestamp_ms", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("start_count", new A0.j("start_count", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        linkedHashSet13.add(new k("scenario_table", "CASCADE", "NO ACTION", E2.d.y("scenario_id"), E2.d.y("id")));
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new l("index_scenario_usage_table_scenario_id", false, E2.d.y("scenario_id"), E2.d.y("ASC")));
        m mVar8 = new m("scenario_usage_table", linkedHashMap8, linkedHashSet13, linkedHashSet14);
        m G15 = D2.f.G(aVar, "scenario_usage_table");
        if (!mVar8.equals(G15)) {
            return new f("scenario_usage_table(com.buzbuz.smartautoclicker.core.database.entity.ScenarioStatsEntity).\n Expected:\n" + mVar8 + "\n Found:\n" + G15, false);
        }
        return new f((String) null, true);
    }

    @Override // c0.g
    public final void a(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
                j.e(aVar, "connection");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `action_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `clickPositionType` TEXT, `x` INTEGER, `y` INTEGER, `clickOnConditionId` INTEGER, `pressDuration` INTEGER, `clickOffsetX` INTEGER, `clickOffsetY` INTEGER, `fromX` INTEGER, `fromY` INTEGER, `toX` INTEGER, `toY` INTEGER, `swipeDuration` INTEGER, `pauseDuration` INTEGER, `isAdvanced` INTEGER, `isBroadcast` INTEGER, `intent_action` TEXT, `component_name` TEXT, `flags` INTEGER, `toggle_all` INTEGER, `toggle_all_type` TEXT, `counter_name` TEXT, `counter_operation` TEXT, `counter_operation_value_type` TEXT, `counter_operation_value` INTEGER, `counter_operation_counter_name` TEXT, `notification_message_type` TEXT, `notification_message_text` TEXT, `notification_message_counter_name` TEXT, `notification_importance` INTEGER, `system_action_type` TEXT, `text_value` TEXT, `text_validate_input` INTEGER, FOREIGN KEY(`eventId`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`clickOnConditionId`) REFERENCES `condition_table`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_action_table_eventId` ON `action_table` (`eventId`)");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_action_table_clickOnConditionId` ON `action_table` (`clickOnConditionId`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `event_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `operator` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `enabled_on_start` INTEGER NOT NULL DEFAULT 1, `type` TEXT NOT NULL, `keep_detecting` INTEGER, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_table_scenario_id` ON `event_table` (`scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `scenario_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `detection_quality` INTEGER NOT NULL, `randomize` INTEGER NOT NULL DEFAULT 0, `keep_screen_on` INTEGER NOT NULL DEFAULT 0)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `condition_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `priority` INTEGER NOT NULL DEFAULT 0, `path` TEXT, `area_left` INTEGER, `area_top` INTEGER, `area_right` INTEGER, `area_bottom` INTEGER, `threshold` INTEGER, `detection_type` INTEGER, `shouldBeDetected` INTEGER, `detection_area_left` INTEGER, `detection_area_top` INTEGER, `detection_area_right` INTEGER, `detection_area_bottom` INTEGER, `broadcast_action` TEXT, `counter_name` TEXT, `counter_comparison_operation` TEXT, `counter_operation_value_type` TEXT, `counter_value` INTEGER, `counter_value_counter_name` TEXT, `timer_value_ms` INTEGER, `timer_restart_when_reached` INTEGER, FOREIGN KEY(`eventId`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_condition_table_eventId` ON `condition_table` (`eventId`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `intent_extra_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `action_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, FOREIGN KEY(`action_id`) REFERENCES `action_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_intent_extra_table_action_id` ON `intent_extra_table` (`action_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `event_toggle_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `action_id` INTEGER NOT NULL, `toggle_type` TEXT NOT NULL, `toggle_event_id` INTEGER NOT NULL, FOREIGN KEY(`action_id`) REFERENCES `action_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`toggle_event_id`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_toggle_table_action_id` ON `event_toggle_table` (`action_id`)");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_toggle_table_toggle_event_id` ON `event_toggle_table` (`toggle_event_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `scenario_usage_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `last_start_timestamp_ms` INTEGER NOT NULL, `start_count` INTEGER NOT NULL, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_scenario_usage_table_scenario_id` ON `scenario_usage_table` (`scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                E2.b.p(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a62460007e73612ac5c1026f111e9b77')");
                return;
            case 1:
                j.e(aVar, "connection");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `action_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `clickPositionType` TEXT, `x` INTEGER, `y` INTEGER, `clickOnConditionId` INTEGER, `pressDuration` INTEGER, `clickOffsetX` INTEGER, `clickOffsetY` INTEGER, `fromX` INTEGER, `fromY` INTEGER, `toX` INTEGER, `toY` INTEGER, `swipeDuration` INTEGER, `pauseDuration` INTEGER, `isAdvanced` INTEGER, `isBroadcast` INTEGER, `intent_action` TEXT, `component_name` TEXT, `flags` INTEGER, `toggle_all` INTEGER, `toggle_all_type` TEXT, `counter_name` TEXT, `counter_operation` TEXT, `counter_operation_value_type` TEXT, `counter_operation_value` INTEGER, `counter_operation_counter_name` TEXT, `notification_message_type` TEXT, `notification_message_text` TEXT, `notification_message_counter_name` TEXT, `notification_importance` INTEGER, `system_action_type` TEXT, `text_value` TEXT, `text_validate_input` INTEGER, FOREIGN KEY(`eventId`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`clickOnConditionId`) REFERENCES `condition_table`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_action_table_eventId` ON `action_table` (`eventId`)");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_action_table_clickOnConditionId` ON `action_table` (`clickOnConditionId`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `event_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `operator` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `enabled_on_start` INTEGER NOT NULL DEFAULT 1, `type` TEXT NOT NULL, `keep_detecting` INTEGER, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_table_scenario_id` ON `event_table` (`scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `scenario_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `detection_quality` INTEGER NOT NULL, `randomize` INTEGER NOT NULL DEFAULT 0, `keep_screen_on` INTEGER NOT NULL DEFAULT 0)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `condition_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `priority` INTEGER NOT NULL DEFAULT 0, `path` TEXT, `area_left` INTEGER, `area_top` INTEGER, `area_right` INTEGER, `area_bottom` INTEGER, `threshold` INTEGER, `detection_type` INTEGER, `shouldBeDetected` INTEGER, `detection_area_left` INTEGER, `detection_area_top` INTEGER, `detection_area_right` INTEGER, `detection_area_bottom` INTEGER, `broadcast_action` TEXT, `counter_name` TEXT, `counter_comparison_operation` TEXT, `counter_operation_value_type` TEXT, `counter_value` INTEGER, `counter_value_counter_name` TEXT, `timer_value_ms` INTEGER, `timer_restart_when_reached` INTEGER, FOREIGN KEY(`eventId`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_condition_table_eventId` ON `condition_table` (`eventId`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `intent_extra_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `action_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, FOREIGN KEY(`action_id`) REFERENCES `action_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_intent_extra_table_action_id` ON `intent_extra_table` (`action_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `event_toggle_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `action_id` INTEGER NOT NULL, `toggle_type` TEXT NOT NULL, `toggle_event_id` INTEGER NOT NULL, FOREIGN KEY(`action_id`) REFERENCES `action_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`toggle_event_id`) REFERENCES `event_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_toggle_table_action_id` ON `event_toggle_table` (`action_id`)");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_event_toggle_table_toggle_event_id` ON `event_toggle_table` (`toggle_event_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `tutorial_success_table` (`tutorial_index` INTEGER NOT NULL, `scenario_id` INTEGER NOT NULL, PRIMARY KEY(`tutorial_index`), FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_tutorial_success_table_scenario_id` ON `tutorial_success_table` (`scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `scenario_usage_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `scenario_id` INTEGER NOT NULL, `last_start_timestamp_ms` INTEGER NOT NULL, `start_count` INTEGER NOT NULL, FOREIGN KEY(`scenario_id`) REFERENCES `scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_scenario_usage_table_scenario_id` ON `scenario_usage_table` (`scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                E2.b.p(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '55fa6e13c659b4559493859aef4c41a0')");
                return;
            default:
                j.e(aVar, "connection");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `dumb_scenario_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `repeat_count` INTEGER NOT NULL, `is_repeat_infinite` INTEGER NOT NULL, `max_duration_minutes` INTEGER NOT NULL, `is_duration_infinite` INTEGER NOT NULL, `randomize` INTEGER NOT NULL)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `dumb_action_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dumb_scenario_id` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `repeat_count` INTEGER, `is_repeat_infinite` INTEGER, `repeat_delay` INTEGER, `press_duration` INTEGER, `x` INTEGER, `y` INTEGER, `swipe_duration` INTEGER, `fromX` INTEGER, `fromY` INTEGER, `toX` INTEGER, `toY` INTEGER, `pause_duration` INTEGER, FOREIGN KEY(`dumb_scenario_id`) REFERENCES `dumb_scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_dumb_action_table_dumb_scenario_id` ON `dumb_action_table` (`dumb_scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS `dumb_scenario_stats_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dumb_scenario_id` INTEGER NOT NULL, `last_start_timestamp_ms` INTEGER NOT NULL, `start_count` INTEGER NOT NULL, FOREIGN KEY(`dumb_scenario_id`) REFERENCES `dumb_scenario_table`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                E2.b.p(aVar, "CREATE INDEX IF NOT EXISTS `index_dumb_scenario_stats_table_dumb_scenario_id` ON `dumb_scenario_stats_table` (`dumb_scenario_id`)");
                E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                E2.b.p(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cc7915adef5aec5cd62afca3a1a6ec74')");
                return;
        }
    }

    @Override // c0.g
    public final void c(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
                j.e(aVar, "connection");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `action_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `event_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `scenario_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `condition_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `intent_extra_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `event_toggle_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `scenario_usage_table`");
                return;
            case 1:
                j.e(aVar, "connection");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `action_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `event_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `scenario_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `condition_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `intent_extra_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `event_toggle_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `tutorial_success_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `scenario_usage_table`");
                return;
            default:
                j.e(aVar, "connection");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `dumb_scenario_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `dumb_action_table`");
                E2.b.p(aVar, "DROP TABLE IF EXISTS `dumb_scenario_stats_table`");
                return;
        }
    }

    @Override // c0.g
    public final void r(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
            case 1:
            default:
                j.e(aVar, "connection");
                return;
        }
    }

    @Override // c0.g
    public final void s(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
                j.e(aVar, "connection");
                E2.b.p(aVar, "PRAGMA foreign_keys = ON");
                ((ClickDatabase_Impl) this.f4999e).l(aVar);
                return;
            case 1:
                j.e(aVar, "connection");
                E2.b.p(aVar, "PRAGMA foreign_keys = ON");
                ((TutorialDatabase_Impl) this.f4999e).l(aVar);
                return;
            default:
                j.e(aVar, "connection");
                E2.b.p(aVar, "PRAGMA foreign_keys = ON");
                ((DumbDatabase_Impl) this.f4999e).l(aVar);
                return;
        }
    }

    @Override // c0.g
    public final void t(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
            case 1:
            default:
                j.e(aVar, "connection");
                return;
        }
    }

    @Override // c0.g
    public final void u(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
                j.e(aVar, "connection");
                D2.f.l(aVar);
                return;
            case 1:
                j.e(aVar, "connection");
                D2.f.l(aVar);
                return;
            default:
                j.e(aVar, "connection");
                D2.f.l(aVar);
                return;
        }
    }

    @Override // c0.g
    public final f v(D0.a aVar) {
        switch (this.f4998d) {
            case 0:
                return w(aVar);
            case 1:
                return x(aVar);
            default:
                j.e(aVar, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
                linkedHashMap.put("repeat_count", new A0.j("repeat_count", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("is_repeat_infinite", new A0.j("is_repeat_infinite", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("max_duration_minutes", new A0.j("max_duration_minutes", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("is_duration_infinite", new A0.j("is_duration_infinite", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("randomize", new A0.j("randomize", "INTEGER", true, 0, null, 1));
                m mVar = new m("dumb_scenario_table", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                m G8 = D2.f.G(aVar, "dumb_scenario_table");
                if (!mVar.equals(G8)) {
                    return new f("dumb_scenario_table(com.buzbuz.smartautoclicker.core.dumb.data.database.DumbScenarioEntity).\n Expected:\n" + mVar + "\n Found:\n" + G8, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
                linkedHashMap2.put("dumb_scenario_id", new A0.j("dumb_scenario_id", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("priority", new A0.j("priority", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("name", new A0.j("name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("type", new A0.j("type", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("repeat_count", new A0.j("repeat_count", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("is_repeat_infinite", new A0.j("is_repeat_infinite", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("repeat_delay", new A0.j("repeat_delay", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("press_duration", new A0.j("press_duration", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("x", new A0.j("x", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("y", new A0.j("y", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("swipe_duration", new A0.j("swipe_duration", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("fromX", new A0.j("fromX", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("fromY", new A0.j("fromY", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("toX", new A0.j("toX", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("toY", new A0.j("toY", "INTEGER", false, 0, null, 1));
                linkedHashMap2.put("pause_duration", new A0.j("pause_duration", "INTEGER", false, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new k("dumb_scenario_table", "CASCADE", "NO ACTION", E2.d.y("dumb_scenario_id"), E2.d.y("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new l("index_dumb_action_table_dumb_scenario_id", false, E2.d.y("dumb_scenario_id"), E2.d.y("ASC")));
                m mVar2 = new m("dumb_action_table", linkedHashMap2, linkedHashSet, linkedHashSet2);
                m G9 = D2.f.G(aVar, "dumb_action_table");
                if (!mVar2.equals(G9)) {
                    return new f("dumb_action_table(com.buzbuz.smartautoclicker.core.dumb.data.database.DumbActionEntity).\n Expected:\n" + mVar2 + "\n Found:\n" + G9, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new A0.j("id", "INTEGER", true, 1, null, 1));
                linkedHashMap3.put("dumb_scenario_id", new A0.j("dumb_scenario_id", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("last_start_timestamp_ms", new A0.j("last_start_timestamp_ms", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("start_count", new A0.j("start_count", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new k("dumb_scenario_table", "CASCADE", "NO ACTION", E2.d.y("dumb_scenario_id"), E2.d.y("id")));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new l("index_dumb_scenario_stats_table_dumb_scenario_id", false, E2.d.y("dumb_scenario_id"), E2.d.y("ASC")));
                m mVar3 = new m("dumb_scenario_stats_table", linkedHashMap3, linkedHashSet3, linkedHashSet4);
                m G10 = D2.f.G(aVar, "dumb_scenario_stats_table");
                if (!mVar3.equals(G10)) {
                    return new f("dumb_scenario_stats_table(com.buzbuz.smartautoclicker.core.dumb.data.database.DumbScenarioStatsEntity).\n Expected:\n" + mVar3 + "\n Found:\n" + G10, false);
                }
                return new f((String) null, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ClickDatabase_Impl clickDatabase_Impl) {
        super(18, "a62460007e73612ac5c1026f111e9b77", "8b0b0231844069415767bd39e052a92f");
        this.f4999e = clickDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TutorialDatabase_Impl tutorialDatabase_Impl) {
        super(18, "55fa6e13c659b4559493859aef4c41a0", "dfca149d9d291bcf5c1e5fb048683419");
        this.f4999e = tutorialDatabase_Impl;
    }
}
