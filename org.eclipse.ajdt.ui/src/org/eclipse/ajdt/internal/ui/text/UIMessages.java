/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Ben Dalziel     - initial version
 *******************************************************************************/
package org.eclipse.ajdt.internal.ui.text;

import org.eclipse.osgi.util.NLS;

/**
 * Helper class to get NLSed messages.
 */
public class UIMessages extends NLS {

	private static final String BUNDLE_NAME= UIMessages.class.getName();
	
	private UIMessages() {
		// Do not instantiate
	}
	
	public static String ajde_version;
    public static String BuildPathsBlock_ChooseOutputFolderDialog_description;
    public static String BuildPathsBlock_ChooseOutputFolderDialog_title;	
	public static String buildPrereqsMessage;	
	public static String Builder_migration_build;	
	public static String Builder_migration_failed_title;
	public static String Builder_migration_failed_message;	
	public static String ajCompilation;	
	public static String codeTemplates_couldNotLoad;
	public static String ajWarningDialogTitle;
	public static String ajErrorDialogTitle;	
	public static String ajErrorText;
	public static String ajdtErrorDialogTitle;
    public static String InPathBlock_6;
    public static String InPathBlock_Browse;
    public static String InPathBlock_DuplicateBuildEntry;
    public static String InPathBlock_outFolder_1;
    public static String InPathBlock_outFolder_2;
    public static String InPathBlock_outFolder_3;
    public static String InPathBlock_outFolder_4;
	public static String jmCoreException;
	public static String buildpathwarning_title;
	public static String addtoinpathwarning;
	public static String addtoaspectpathwarning;
	public static String newConfig;	
	public static String BuildConfig_createLstFile;
	public static String BuildConfig_createLstDesc;	
	public static String BuildConfig_openForEdit;
	public static String BuildConfig_activate;
	public static String BuildConfig_newBCFile;	
	public static String BuildConfig_needToSelectProject;
	public static String NewAspectjProjectCreationWizard_title;	
	public static String NewAspectjProjectCreationWizard_op_error_title;
	public static String NewAspectjProjectCreationWizard_op_error_message;
	public static String NewAspectjProjectCreationWizard_MainPage_project_exists_capitalization;
	public static String EditorRulerContextMenu_relatedLocations;
	public static String EditorRulerContextMenu_relatedLocation_message;	
	public static String PluginImportDialog_importConfirmTitle;
	public static String PluginImportDialog_importConfirmMsg;
	public static String PluginImportDialog_importConfirmToggleMsg ;	
	public static String NoAutoPluginImportDialog_title;
	public static String NoAutoPluginImportDialog_message;	
	public static String AutoPluginImportDialog_noEditor_title;
	public static String AutoPluginImportDialog_noEditor_message;
	public static String AutoPluginRemoveDialog_noEditor_title;
	public static String AutoPluginRemoveDialog_noEditor_message;
	public static String AutoPluginRemoveErrorDialog_title;
	public static String AutoPluginRemoveErrorDialog_message;
	public static String PluginImportDialog_removeImportConfirmTitle;
	public static String PluginImportDialog_removeImportConfirmMsg;
	public static String PluginImportDialog_removeNonPluginImportConfirmTitle;
	public static String PluginImportDialog_removeNonPluginImportConfirmMsg;
	public static String PluginImportDialog_removeImportConfirmToggleMsg;	
	public static String NewAspectJProject_CreateAnAspectJProject;
	public static String NewAspectJProject_CreateAnAspectJProjectDescription;
	public static String NewAspectJProject_BuildSettings;
	public static String NewAspectJProject_BuildSettingsDescription;
	public static String NewTypeWizardPage_SuperClassDialog_title;
	public static String NewTypeWizardPage_SuperClassDialog_message;	
	public static String PluginExportWizard_31Title;
	public static String NewAspectCreationWizard_title;
	public static String NewAspectCreationWizardPage_title;
	public static String NewAspectCreationWizardPage_description;
	public static String NewAspectCreationWizardPage_supertype_label;	
	public static String NewAspectCreationWizardPage_instantiation_label;
	public static String NewAspectCreationWizardPage_stubs_label;
	public static String NewAspectCreationWizardPage_pointcuts_inherited;
	public static String NewAspectCreationWizardPage_must_be_AJ_project;
	public static String BuildConfigurator_workbench_openXRefView;
	public static String BuildConfigurator_ErrorOpeningXRefView;
	public static String ajEditor;
	public static String AspectJEditor_runtimetest;
	public static String AspectJMarkersAtLine;
	public static String compilerPropsPage_description;
	public static String compilerPropsPage_nonStandardOptions;
	public static String compilerPropsPage_outputJar;
	public static String aspectjPreferences_description;
	public static String aspectjPreferences_compilerVersion;
	public static String aspectjPreferences_pluginVersion;
	public static String aspectjPreferences_adviceDec;
	public static String CompilerConfigurationBlock_error;
	public static String CompilerConfigurationBlock_warning;
	public static String CompilerConfigurationBlock_ignore;
	public static String CompilerConfigurationBlock_needsbuild_title;
	public static String CompilerConfigurationBlock_needsfullbuild_message;
	public static String CompilerConfigurationBlock_needsprojectbuild_message;
	public static String OptionsConfigurationBlock_builderror_message;
	public static String OptionsConfigurationBlock_buildall_taskname;
	public static String OptionsConfigurationBlock_buildproject_taskname;
	public static String CompilerPropertyPage_useworkspacesettings_label;
	public static String CompilerPropertyPage_useworkspacesettings_change;
	public static String CompilerPropertyPage_useprojectsettings_label;
	public static String CompilerConfigurationBlock_aj_messages_matching;
	public static String CompilerConfigurationBlock_aj_messages_optimization;
	public static String CompilerConfigurationBlock_aj_messages_java5;
	public static String CompilerConfigurationBlock_aj_messages_java5_label;
	public static String CompilerConfigurationBlock_aj_messages_programming;
	public static String CompilerConfigurationBlock_aj_messages_information;
	public static String CompilerConfigurationBlock_aj_messages_description;
	public static String CompilerConfigurationBlock_aj_invalid_absolute_type_name_label;
	public static String CompilerConfigurationBlock_aj_invalid_wildcard_type_name_label;
	public static String CompilerConfigurationBlock_aj_unresolvable_member_label;
	public static String CompilerConfigurationBlock_aj_type_not_exposed_to_weaver_label;
	public static String CompilerConfigurationBlock_aj_shadow_not_in_structure_label;
	public static String CompilerConfigurationBlock_aj_unmatched_super_type_in_call_label;
	public static String CompilerConfigurationBlock_aj_cannot_implement_lazy_tjp_label;
	public static String CompilerConfigurationBlock_aj_need_serial_version_uid_field_label;
	public static String CompilerConfigurationBlock_aj_incompatible_serial_version_label;
	public static String CompilerConfigurationBlock_aj_no_interface_ctor_joinpoint_label;
	public static String CompilerConfigurationBlock_aj_cant_find_type;
	public static String CompilerConfigurationBlock_aj_calculating_serial_version_UID;
	public static String CompilerConfigurationBlock_aj_cant_find_type_affecting_jp_match;
	public static String CompilerConfigurationBlock_aj_no_weave_label;
	public static String CompilerConfigurationBlock_aj_x_serializable_aspects_label;
	public static String CompilerConfigurationBlock_aj_x_no_inline_label;
	public static String CompilerConfigurationBlock_aj_x_not_reweavable_label;
	public static String CompilerConfigurationBlock_aj_x_has_member_label;
	public static String CompilerConfigurationBlock_aj_out_xml;
	public static String CompilerConfigurationBlock_aj_other_tabtitle;
	public static String CompilerConfigurationBlock_aj_enable_weave_messages_label;
	public static String CompilerConfigurationBlock_noJoinpointsForBridgeMethods;
	public static String CompilerConfigurationBlock_cantMatchArrayTypeOnVarargs;
	public static String CompilerConfigurationBlock_enumAsTargetForDecpIgnored;
	public static String CompilerConfigurationBlock_annotationAsTargetForDecpIgnored;
	public static String CompilerConfigurationBlock_invalidTargetForAnnotation;
	public static String CompilerConfigurationBlock_elementAlreadyAnnotated;
	public static String CompilerConfigurationBlock_adviceDidNotMatch;
	public static String CompilerConfigurationBlock_runtimeExceptionNotSoftened;
	public static String CompilerConfigurationBlock_unmatchedTargetKind;
	public static String CompilerConfigurationBlock_uncheckedArgument;
	public static String CompilerConfigurationBlock_uncheckedAdviceConversion;
	public static String CompilerConfigurationBlock_unordered_advice_at_shadow;
	public static String CompilerConfigurationBlock_swallowed_exception_in_catch_block;
	public static String CompilerConfigurationBlock_aspect_excluded_by_configuration;
	public static String CompilerConfigurationBlock_no_explicit_constructor_call;
	public static String CompilerConfigurationBlock_no_guard_for_lazy_tjp;
	public static String CompilerConfigurationBlock_multiple_advice_stopping_lazy_tjp;
	public static String InPathBlock_tab_inpath_order;
	public static String InPathBlock_tab_libraries;
	public static String PathBlock_order_up_button;
	public static String PathBlock_order_down_button;
	public static String AspectPathBlock_tab_libraries;
	public static String AspectPathBlock_note;
	public static String InPathBlock_note;
	public static String InPathLibrariesWorkbookPage_NewClassFolderDialog_new_title;
	public static String InPathLibrariesWorkbookPage_NewClassFolderDialog_edit_title;
	public static String InPathLibrariesWorkbookPage_NewClassFolderDialog_description;
	public static String InPathLibrariesWorkbookPage_configurecontainer_error_title;
	public static String InPathLibrariesWorkbookPage_configurecontainer_error_message;
	public static String InPathLibrariesWorkbookPage_exclusion_added_title;
	public static String InPathLibrariesWorkbookPage_exclusion_added_message;
	public static String InPathLibrariesWorkbookPage_libraries_inpath_label;
	public static String PathLibrariesWorkbookPage_libraries_addjar_button;
	public static String PathLibrariesWorkbookPage_libraries_addextjar_button;
	public static String PathLibrariesWorkbookPage_libraries_addvariable_button;
	public static String PathLibrariesWorkbookPage_libraries_addlibrary_button;
	public static String PathLibrariesWorkbookPage_libraries_addclassfolder_button;
	public static String PathLibrariesWorkbookPage_libraries_edit_button;
	public static String PathLibrariesWorkbookPage_libraries_remove_button;
	public static String PathLibrariesWorkbookPage_libraries_addproject_button;
	public static String AspectPathLibrariesWorkbookPage_NewClassFolderDialog_description;
	public static String AspectPathLibrariesWorkbookPage_configurecontainer_error_title;
	public static String AspectPathLibrariesWorkbookPage_configurecontainer_error_message;
	public static String AspectPathLibrariesWorkbookPage_exclusion_added_message;
	public static String PathBlock_operationdesc_java;
	public static String InPathBlock_warning_EntryMissing;
	public static String InPathBlock_warning_EntriesMissing;
	public static String InPathBlock_inpath_label;
	public static String InPathBlock_inpath_checkall_button;
	public static String InPathBlock_inpath_uncheckall_button;
	public static String AspectPathBlock_aspectpath_label;
	public static String AspectPathBlock_warning_EntryMissing;
	public static String AspectBlock_warning_EntriesMissing;
	public static String InPathProp_exceptionInitializingInpath_title;
	public static String InPathProp_exceptionInitializingInpath_message;
	public static String AspectPathProp_exceptionInitializingAspectpath_title;
	public static String AspectPathProp_exceptionInitializingAspectpath_message;
	public static String Path_entryNotFound_warningTitle;
	public static String Path_entryNotFound_warningMessage;
	public static String BuildPage_name;
	public static String buildConfig_invalidOutjar ;
	public static String AJPropsEditor_BuildPage_title ;
	public static String AJPropsEditor_SrcSection_title ;
	public static String AJPropsEditor_SrcSection_desc ;
	public static String buildConfig_exceptionIncluding;
	public static String buildConfig_exceptionException;
	public static String buildConfig_exceptionWriting ;
	public static String buildConfig_notFound;
	public static String buildConfig_standardFileName; 
	public static String BCDialog_Overwrite_title ;
	public static String BCDialog_Overwrite_message ;
	public static String BCDialog_Overwrite_yes ;
	public static String BCDialog_Overwrite_no ;
	public static String BCDialog_SaveLstAsAJProp_title ;
	public static String BCDialog_SaveLstAsAJProp_message ;
	public static String BCDialog_SaveAJPropAsLst_title ;
	public static String BCDialog_SaveAJPropAsLst_message ;
	public static String BCDialog_SaveBuildConfigurationAs_title ;
	public static String BCDialog_SaveBuildConfigurationAs_message ;
	public static String BCDialog_SaveBuildConfigurationAs_default;
	public static String BCDialog_NameValidator_ExistsError;
	public static String BCLabels_SaveBCAs;
	public static String BCLabels_ConfigurationSelectionMenu;
	public static String BCLabels_IncludeAction;
	public static String BCLabels_ExcludeAction;
	public static String ajdocWizard_javadocwizard_title;
	public static String ajdocWizard_ajdocprocess_label;
	public static String ajdocWizardPage_javadocwizardpage_description;
	public static String ajdocTreeWizardPage_visibilitygroup_label;
	public static String ajdocTreeWizardPage_privatevisibilitydescription_label;
	public static String ajdocTreeWizardPage_packagevisibledescription_label;
	public static String ajdocTreeWizardPage_protectedvisibilitydescription_label;
	public static String ajdocTreeWizardPage_publicvisibilitydescription_label;
	public static String ajdocTreeWizardPage_javadoctreewizardpage_description;
	public static String ajdocTreeWizardPage_warning_mayoverwritefiles;
	public static String ajdocTreeWizardPage_ajdoccommand_label;
	public static String ajdocTreeWizardPage_ajdoccmd_error_enterpath;
	public static String ajdocTreeWizardPage_ajdoccmd_error_notexists;
	public static String AJdocTreeWizardPage_ajdoccmd_dialog_title;
	public static String ajdocTreeWizardPage_MAC_ajdoccommand_label;
	public static String ajdocTreeWizardPage_MAC_ajdoccmd_error_enterpath;
	public static String ajdocTreeWizardPage_MAC_ajdoccmd_error_notexists;
	public static String AJdocTreeWizardPage_MAC_ajdoccmd_dialog_title;
	public static String ajdocSpecificsWizardPage_description;
	public static String ajdocSpecificsWizardPage_vmoptionsfield_label;
	public static String ajdoc_error_noProjectSelected;
	public static String ajdoc_info_projectselection;
	public static String ajdocWizard_error_title;
	public static String ajdocWizard_error_cant_find_ajde_jar;
	public static String ajdocWizard_error_cant_find_weaver_jar;
	public static String ajdocWizard_error_cant_find_runtime_jar;
	public static String ajdocWizard_launch_error_message;
	public static String ajdocWizard_exec_error_message;
	public static String myEclipse_natureDetected_title;
	public static String myEclipse_natureDetected_message;
	public static String AspectJWarning;
	public static String AspectJError;
	public static String ResetColorMemory;
	public static String HideErrors;
	public static String HideWarnings;
	public static String Launcher_aspectPath;
	public static String Launcher_outJar;
	public static String FileFilterDialog_JobTitle;
	public static String FileFilterDialog_Title;
	public static String FileFilterDialog_Message;
	public static String FileFilterDialog_CheckboxCaption;
	public static String codeAssist_limited_title;
	public static String codeAssist_limited_message;
	public static String Refactoring_ErrorRenamingResource;
	public static String Refactoring_ConvertAllToJava;
	public static String Refactoring_ConvertAllToAJ;
	public static String Refactoring_ConvertAspectsToAJAndClassesToJava;
	public static String Refactoring_IncludeFilesNotInBuild;
	public static String Refactoring_UpdateBuildConfigs;
	public static String Refactoring_ConvertFileExtensions;
	public static String Refactoring_ConvertingFileExtensions;
    public static String UIBuildListener_InvalidInpathOutFolderText;
	public static String utils_refresh_explorer_job;
	public static String utils_refresh_outline_job;
	public static String editor_title_refresh_job;
	public static String wrong_eclipse_version;
	public static String savemap_dialog_title;
	public static String savemap_as_default;
	public static String savemap_dialog_message;
	public static String changesView_table_column1;
	public static String changesView_table_column2;
	public static String changesView_table_column3;
	public static String changesView_table_column4;
	public static String changesView_table_added;
	public static String changesView_table_removed;
	public static String changesView_description;
	public static String changesView_currentBuild;
	public static String changesView_ComparisonReference;
	public static String changesView_ComparisonReference_no_project;
	public static String changesView_ComparisonReference_last_inc;
	public static String changesView_ComparisonReference_last_full;
	public static String ajmapEditor_title;
	public static String ajmapEditor_heading;
	public static String ajmapEditor_description;
	public static String ajmapEditor_info_heading;
	public static String ajmapEditor_last_mod_date;
	public static String ajmapEditor_file_version;
	public static String ajmapEditor_rel_heading;
	public static String ajmapEditor_rel_total;
	public static String changesView_filter_dialog_title;
	public static String changesView_filter_dialog_message;
	public static String changesView_filter_dialog_showingXofY;
	public static String changesView_filter_action_tooltip;
	public static String changesView_propagate_message;
	public static String changesView_propagate_tooltip;
	public static String changesView_filter_added_rels;
	public static String changesView_filter_removed_rels;
	public static String changesView_compare_message;
	public static String changesView_compare_tooltip;
	public static String quickFix_ConvertProjectToAspectJ;
	public static String quickFix_OpenInAspectJEditor;
	public static String AJFiles_title;
	public static String AJFiles_message;
	public static String ExcludedAJ_title;
	public static String ExcludedAJ_message;
	public static String UpdateJob_name;
	public static String buildConfigurationChangeAction_job_name;
	public static String excludeAction_job_name;
	public static String includeAction_job_name;
	public static String dynamicBuildConfigurationMenu_job_name;
	public static String PulldownBuildselectorMenu_no_open_ajproject;
	public static String PulldownBuildselectorMenu_build_error;
	public static String CompilerMonitor_building_Project;
	public static String CompilerMonitor_weaving;
	public static String CompilerTaskListManager_Error_creating_marker;
	public static String CompilerTaskListManager_Error_adding_problem_markers;
	public static String BuildConfigEditor_failed_update;
	public static String BuildConfigEditor_unable_to_go_to_marker;
	public static String BuildConfigEditor_invalid_input;
	public static String AdviceActionDelegate_exception_adding_advice_to_context_menu;
	public static String AdviceActionDelegate_unable_to_create_marker;
	public static String AdviceActionDelegate_exception_jumping;
	public static String AdviceActionDelegate_problem_finding_jump_location;
	public static String AdviceActionDelegate_resource_not_found;
	public static String AdviceActionDelegate_show_comparison;
	public static String PointcutNavigatorView_rebuild_to_view_structure;
	public static String PointcutNavigatorView_advises;
	public static String PointcutNavigatorView_pin_structure_model;
	public static String PointcutNavigatorView_pin_structure_model_tooltip;
	public static String AJCompilerPreferencePage_aspectj_compiler;
	public static String AJXReferenceProvider_description;
	public static String AJDTUtils_project_cannot_be_rebuilt;
	public static String AJDTUtils_cleaning_recommended;
	public static String AJDTUtils_no_message;
	public static String AJDTStructureViewNode_import_declarations;
	public static String AJDTStructureViewNode_matches; 
	public static String AJDTStructureViewNode_runtime_test;
	public static String AspectJUIPlugin_exception_in_selection_changed;
	public static String AspectJUIPlugin_exception_retrieving_lst_files;
	public static String LTWAspectPathTab_errormessage;
	public static String LTWAspectPathTab_label;
	public static String LTWAspectPathTab_title;
	public static String LTW_error_launching;
	public static String LTW_error_wrong_jre;
	public static String CustomMarkerImageProvider_Arrow;
	public static String CustomMarkerImageProvider_Bulb;
	public static String CustomMarkerImageProvider_Circle;
	public static String CustomMarkerImageProvider_Clock;
	public static String CustomMarkerImageProvider_Cog;
	public static String CustomMarkerImageProvider_Cross;
	public static String CustomMarkerImageProvider_Debug;
	public static String CustomMarkerImageProvider_Document;
	public static String CustomMarkerImageProvider_Exclamation;
	public static String CustomMarkerImageProvider_Key;
	public static String CustomMarkerImageProvider_Plus;
	public static String CustomMarkerImageProvider_ReadWrite;
	public static String CustomMarkerImageProvider_Tick;
	public static String CustomMarkerImageProvider_Pencil;
	public static String CustomMarkerImageProvider_JUnit;
	public static String CustomMarkerImageProvider_Progress;
	public static String AJMarkersPropertyPage_default;
	public static String AJMarkersPropertyPage_none;
	public static String AJMarkersPropertyPage_configure_icons;
	public static String AJMarkersPropertyPage_aspect;
	public static String AJMarkersPropertyPage_icon_for_markers;
	public static String AJMarkersPropertyPage_edit;
	public static String AJMarkersPropertyPage_select_icon;
	public static String AJMarkersPropertyPage_select_an_icon;
	public static String AJMarkersPropertyPage_default_label;
	public static String AJMarkersPropertyPage_none_label;
	public static String AJMarkersPropertyPage_custom;
	public static String AJMarkersPropertyPage_browse;
	public static String AJMarkersDialog_configure_title;
	public static String AJMarkersDialog_aspect;
	public static String AJMarkersDialog_icon;
	public static String AJMarkersDialog_defaultPackage;
	public static String CrosscuttingChangedMarkerText;
	public static String AdviceActionDelegate_ajtools;
	public static String AdviceActionDelegate_configure_markers;
	public static String eventTrace_filter_dialog_title;
	public static String eventTrace_filter_dialog_message;
	public static String eventTrace_filter_action_tooltip;
	public static String eventTrace_category_compiler;
	public static String eventTrace_category_compiler_progress;
	public static String eventTrace_category_compiler_messages;
	public static String eventTrace_category_builder;
	public static String eventTrace_category_builder_classpath;

	public static String ManageBreakpointRulerAction_label;
	public static String ManageBreakpointRulerAction_error_adding_message1;
	public static String ManageBreakpointRulerAction_Breakpoints_can_only_be_created_within_the_type_associated_with_the_editor___0___1;
	
	public static String OpenAspect_showCrossReferencesView_question;
	public static String OpenAspect_showCrossReferencesView_explanation;
	
	public static String CompilerConfigurationBlock_aj_builder_settings;
	public static String CompilerConfigurationBlock_aj_suppressAutoBuild;

	static {
		NLS.initializeMessages(BUNDLE_NAME, UIMessages.class);
	}
	
}
