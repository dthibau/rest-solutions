export * from './emprunts.service';
import { EmpruntsService } from './emprunts.service';
export * from './exemplaires.service';
import { ExemplairesService } from './exemplaires.service';
export * from './media.service';
import { MediaService } from './media.service';
export const APIS = [EmpruntsService, ExemplairesService, MediaService];
